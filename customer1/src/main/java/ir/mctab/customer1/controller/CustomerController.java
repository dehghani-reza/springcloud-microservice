package ir.mctab.customer1.controller;

import ir.mctab.customer1.client.ProductClient;
import ir.mctab.customer1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private ProductClient productClient;

    @Autowired
    public CustomerController(ProductClient productClient) {
        this.productClient = productClient;
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable String id){
        return productClient.getProductById(id);
    }
}
