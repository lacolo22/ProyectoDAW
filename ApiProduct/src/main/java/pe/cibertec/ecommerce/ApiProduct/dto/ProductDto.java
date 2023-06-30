
package pe.cibertec.ecommerce.ApiProduct.dto;

import lombok.Data;
import pe.cibertec.ecommerce.ApiProduct.entity.Category;

 @Data
public class ProductDto {
    
   
    private Long id;
    private String productName;
    private Double UnitPrice;
    private Category category;

    
}
