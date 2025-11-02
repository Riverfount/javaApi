package com.riverfount.apijava.repositories;

import com.riverfount.apijava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
