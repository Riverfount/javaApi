package com.riverfount.apijava.repositories;

import com.riverfount.apijava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
