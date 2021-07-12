package DataBasePatterns;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class ProductIdentityMap {

    private final static Logger LOGGER = Logger.getLogger(ProductIdentityMap.class.getName());
    private static Map<Long, Product> productMap = new HashMap<>();

    // добавить товар в IdentityMap
    public static void addProduct(Product product) {
        LOGGER.info("... adding Product into IdentityMap");
        productMap.put(product.getProductId(), product);
    }

    // пролучить продукт по ключу
    public static Product getProduct(Long key) {
        LOGGER.info("... trying to find Product in IdentityMap");
        return (Product) productMap.get(key);
    }

    // удалить продукт из IdentityMap по ключу и вернуть удаленный объект
    public static Product removeProduct(Long key) {
        LOGGER.info("... removing Product from IdentityMap");
        Product prod = productMap.get(key);
        productMap.remove(key);
        return prod;
    }
}
