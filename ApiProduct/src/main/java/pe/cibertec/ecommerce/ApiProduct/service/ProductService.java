
package pe.cibertec.ecommerce.ApiProduct.service;

import pe.cibertec.ecommerce.ApiProduct.dto.ProductDto;
import pe.cibertec.ecommerce.ApiProduct.entity.Product;


public interface ProductService {
    
    public Product add(Product product);
    
    public ProductDto findById(Long Id);
    
}
