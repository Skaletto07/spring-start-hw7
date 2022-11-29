package com.kostkin.springstarthomework7.controllers;


import com.kostkin.springstarthomework7.models.Product;
import com.kostkin.springstarthomework7.repositories.ProductRepository;
import com.kostkin.springstarthomework7.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }


    @GetMapping("/products/{id}")
    public Product findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/products")
    public List<Product> all() {
        return service.findAllProducts();
    }

    @GetMapping("/products/greater")
    public List<Product> allGreaterThen(@RequestParam double greater) {
        return service.findAllProductsGreater(greater);
    }

    @GetMapping("/products/less")
    public List<Product> allLessThen(@RequestParam double less) {
        return service.findAllProductsLessThen(less);
    }

    @GetMapping("/products/greaterAndLess")
    public List<Product> allGreaterAndLessThen(@RequestParam double greater, @RequestParam double less) {
        return service.findAllProductsGreaterAndLessThen(greater, less);
    }

    @PostMapping("/products")
    public void add(Product product) {
        service.createProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable long id) {
        service.deleteProductById(id);
    }
}
