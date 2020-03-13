package ir.mctab.product.controller;

import ir.mctab.product.model.Product;
import ir.mctab.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Product findById(@PathVariable String id){
        return productService.findProductById(id);
    }
}
