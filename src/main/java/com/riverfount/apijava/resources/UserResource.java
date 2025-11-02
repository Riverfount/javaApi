package com.riverfount.apijava.resources;

import com.riverfount.apijava.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> getAllUser() {
        User user = new User(1L, "John Due", "john@due.com", "+18800345342",
                "123test456");
        return ResponseEntity.ok(user);
    }
}
