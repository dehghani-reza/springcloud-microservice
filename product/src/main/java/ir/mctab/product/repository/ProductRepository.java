package ir.mctab.product.repository;

import ir.mctab.product.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product("p1","TV"));
        productList.add(new Product("p2","RADIO"));
    }

    public Product getProduct(String id){
        return productList.stream().filter(product -> product.getId().equals(id)).findAny().orElse(null);
    }
}
