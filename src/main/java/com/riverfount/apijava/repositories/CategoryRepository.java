package com.riverfount.apijava.repositories;

import com.riverfount.apijava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
