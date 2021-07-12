package DataBasePatterns;

import java.util.Optional;

public interface ProductDataMapper {

    Optional<Product> find(Long productId);

    void insert(Product product) throws DataMapperException;

    void update(Product newProduct) throws DataMapperException;

    void delete(Product product) throws DataMapperException;
}
