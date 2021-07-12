import DataBasePatterns.Product;
import DataBasePatterns.ProductDataMapper;
import DataBasePatterns.ProductDataMapperImpl;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.logging.Logger;

public final class DemoApp {

    private final static Logger LOGGER = Logger.getLogger(DemoApp.class.getName());

    public static void main(final String...args) {

        final ProductDataMapper mapper = new ProductDataMapperImpl();
        Product product = new Product(1, "Adam", BigDecimal.valueOf(100.01));
        mapper.insert(product);
        LOGGER.info( "product: " + product + ", is inserted");

        final Optional<Product> productToBeFound = mapper.find(product.getProductId());
        LOGGER.info("product: " + productToBeFound + ", is searched");
        product = new Product(product.getProductId(), "AdamUpdated", BigDecimal.valueOf(222.22));
        mapper.update(product);
        LOGGER.info("product: " + product + ", is updated");

        LOGGER.info("product: " + product + ", is going to be deleted");
        mapper.delete(product);
    }
}

/* РЕЗУЛЬТАТ:

июл. 12, 2021 10:16:27 PM DataBasePatterns.ProductIdentityMap getProduct
INFO: ... trying to find Product in IdentityMap
июл. 12, 2021 10:16:27 PM DataBasePatterns.ProductIdentityMap addProduct
INFO: ... adding Product into IdentityMap
июл. 12, 2021 10:16:27 PM DemoApp main
INFO: product: Product [productId=1, name=Adam, price=100.01], is inserted
июл. 12, 2021 10:16:27 PM DataBasePatterns.ProductIdentityMap getProduct
INFO: ... trying to find Product in IdentityMap
июл. 12, 2021 10:16:27 PM DemoApp main
INFO: product: Optional.empty, is searched
июл. 12, 2021 10:16:27 PM DataBasePatterns.ProductIdentityMap getProduct
INFO: ... trying to find Product in IdentityMap
июл. 12, 2021 10:16:27 PM DataBasePatterns.ProductIdentityMap removeProduct
INFO: ... removing Product from IdentityMap
июл. 12, 2021 10:16:27 PM DataBasePatterns.ProductIdentityMap addProduct
INFO: ... adding Product into IdentityMap
июл. 12, 2021 10:16:27 PM DemoApp main
INFO: product: Product [productId=1, name=AdamUpdated, price=222.22], is updated
июл. 12, 2021 10:16:27 PM DemoApp main
INFO: product: Product [productId=1, name=AdamUpdated, price=222.22], is going to be deleted
июл. 12, 2021 10:16:27 PM DataBasePatterns.ProductIdentityMap getProduct
INFO: ... trying to find Product in IdentityMap
июл. 12, 2021 10:16:27 PM DataBasePatterns.ProductIdentityMap removeProduct
INFO: ... removing Product from IdentityMap

 */