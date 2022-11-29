package com.kostkin.springstarthomework7.database;

import com.kostkin.springstarthomework7.models.Product;
import com.kostkin.springstarthomework7.repositories.ProductRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFilter {
    private final ProductRepository repository;

    public DatabaseFilter(ProductRepository repository) {
        this.repository = repository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDatabaseOnStartApplication() {
        repository.save(new Product("Melon", 3.4));
        repository.save(new Product("Bread", 2.3));
        repository.save(new Product("Rolls", 5.1));
        repository.save(new Product("Cakes", 32.4));
        repository.save(new Product("Pastry", 34.42));
        repository.save(new Product("Meat", 4.4));
        repository.save(new Product("Fish", 78.3));
        repository.save(new Product("Poultry", 7.1));
        repository.save(new Product("Cheese", 6.9));
        repository.save(new Product("Ice cream", 4.0));
        repository.save(new Product("Nuts", 33.4));
        repository.save(new Product("Apple", 5.2));
        repository.save(new Product("Pear", 2.2));
        repository.save(new Product("Apricot", 6.8));
        repository.save(new Product("Peach", 7.3));
        repository.save(new Product("Nectarine", 12.4));
        repository.save(new Product("Plum", 31.2));
        repository.save(new Product("Grapes", 23.4));
        repository.save(new Product("Banana", 33.0));
        repository.save(new Product("Beer", 1.5));
    }
}
