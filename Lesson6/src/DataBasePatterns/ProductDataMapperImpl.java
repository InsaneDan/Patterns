package DataBasePatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class ProductDataMapperImpl implements ProductDataMapper {

    // имитация базы данных
    private List<Product> products = new ArrayList<>();

    private ProductIdentityMap productMap = new ProductIdentityMap();

    @Override
    public Optional<Product> find(Long productId) {

        // проверяем IdentityMap
        Product product = productMap.getProduct(productId);
        if (product == null) {
            // достаем товар из базы данных (имитация, поэтому в цикле)
            for (final Product productFromDB: this.getProducts()) {
                if (productFromDB.getProductId() == productId) {
                    // если есть результат, то добавляем товар в IdentityMap
                    productMap.addProduct(product);
                    // и возвращаем результат
                    return Optional.of(product);
                }
            }
        }
        // если товар не найден - вернуть пустой Optional
        return Optional.empty();
    }

    @Override
    public void update(Product productToBeUpdated) throws DataMapperException {

        Product product = productMap.getProduct(productToBeUpdated.getProductId());
        if (product != null) {
            // удалить из IdentityMap
            productMap.removeProduct(productToBeUpdated.getProductId());
        }


        // поиск в базе
        if (this.getProducts().contains(productToBeUpdated)) {
            final int index = this.getProducts().indexOf(productToBeUpdated);
            this.getProducts().set(index, productToBeUpdated);
            productMap.addProduct(productToBeUpdated); // добавить в IdentityMap
        } else {
            throw new DataMapperException("Product [" + productToBeUpdated.getName() + "] is not found");
        }
    }

    @Override
    public void insert(Product productToBeInserted) throws DataMapperException {
        Product product = productMap.getProduct(productToBeInserted.getProductId());
        if (product == null && !this.getProducts().contains(productToBeInserted)) {
            this.getProducts().add(productToBeInserted);
            productMap.addProduct(productToBeInserted); // добавить в IdentityMap
        } else {
            throw new DataMapperException("Product [" + productToBeInserted.getName() + "] already exists");
        }
    }

    @Override
    public void delete(Product productToBeDeleted) throws DataMapperException {
        Product product = productMap.getProduct(productToBeDeleted.getProductId());
        if (product != null) {
            productMap.removeProduct(productToBeDeleted.getProductId());
        }

        if (this.getProducts().contains(productToBeDeleted)) {
            this.getProducts().remove(productToBeDeleted);
        } else {
            throw new DataMapperException("Product [" + productToBeDeleted.getName() + "] is not found");
        }
    }

    public List <Product> getProducts() {
        return this.products;
    }
}
