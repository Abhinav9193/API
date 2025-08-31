package com.abhinav.asd.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/products")
public class ProductController {
    private List<String> products = new ArrayList<>(Arrays.asList("Laptop", "Phone", "Tablet"));
    @GetMapping
    public List<String> getAllProducts() {
        return products;
    }
    @PostMapping
    public String addProduct(@RequestBody String product) {
        products.add(product);
        return "Product added: " + product;
    }
}
