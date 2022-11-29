package com.kostkin.springstarthomework7.repositories;


import com.kostkin.springstarthomework7.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCostGreaterThan(double greater);
    List<Product> findAllByCostLessThan(double less);
    List<Product> findAllByCostGreaterThanAndCostLessThan(double greater, double less);

}
