package ir.mctab.customer1.client;

import ir.mctab.customer1.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("${microservice-name}")
public interface ProductClient {

    @GetMapping("/product/{id}")
    Product getProductById(@PathVariable String id);
}
