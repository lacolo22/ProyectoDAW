
package pe.cibertec.ecommerce.ApiProduct.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.ecommerce.ApiProduct.entity.Category;


@FeignClient (value="feig-client", 
        url = "http://localhost:8085")
public interface ApiRestClient {
    @GetMapping("/api/category/findByIdCategory/{idCategory}")
    public Category findByCategoryId(@PathVariable String idCategory);
    
}
