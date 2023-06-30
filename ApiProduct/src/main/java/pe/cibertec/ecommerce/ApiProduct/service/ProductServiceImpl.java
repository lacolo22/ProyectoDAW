
package pe.cibertec.ecommerce.ApiProduct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiProduct.dao.ProductRepository;
import pe.cibertec.ecommerce.ApiProduct.dto.ProductDto;
import pe.cibertec.ecommerce.ApiProduct.entity.Category;

import pe.cibertec.ecommerce.ApiProduct.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
    private ApiRestClient apiRestClient;

    @Override
    public Product add(Product product) {
        return productRepository.save(product);
        
    }

    @Override
    public ProductDto findById(Long id) {
        Product p = productRepository.findById(id).get();
        Category c = apiRestClient.findByCategoryId(p.getIdCategory());
        
        ProductDto productDto = new ProductDto();
        productDto.setId(p.getId());
        productDto.setProductName(p.getProductName());
        productDto.setUnitPrice(p.getUnitPrice());
        productDto.setCategory(c);
        return productDto;
        
    }
    
}
