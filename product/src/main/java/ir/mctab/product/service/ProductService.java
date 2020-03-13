package ir.mctab.product.service;

import ir.mctab.product.model.Product;
import ir.mctab.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product findProductById(String id){
    return productRepository.getProduct(id);
    }
}
