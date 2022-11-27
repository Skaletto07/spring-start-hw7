package com.kostkin.springstarthomework7.service;

import com.kostkin.springstarthomework7.models.Product;
import com.kostkin.springstarthomework7.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product findById(long id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Product> findAllProducts() {
        return repository.findAll();
    }

    public List<Product> findAllProductsGreater(double greater) {
        return repository.findAllByCostGreaterThan(greater);
    }

    public List<Product> findAllProductsLessThen(double less) {
        return repository.findAllByCostLessThan(less);
    }

    public List<Product> findAllProductsGreaterAndLessThen(double greater, double less) {
        return repository.findAllByCostGreaterThanAndCostLessThan(greater, less);
    }


    public void createProduct(Product product) {
        repository.save(product);
    }

    public void deleteProductById(long id) {
        repository.deleteById(id);
    }
}
