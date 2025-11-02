package com.riverfount.apijava.repositories;

import com.riverfount.apijava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
