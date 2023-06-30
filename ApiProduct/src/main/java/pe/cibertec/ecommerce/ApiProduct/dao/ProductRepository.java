
package pe.cibertec.ecommerce.ApiProduct.dao;

import org.springframework.data.repository.CrudRepository;
import pe.cibertec.ecommerce.ApiProduct.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
