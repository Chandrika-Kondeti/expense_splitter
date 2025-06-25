package com.chandrika.expense_splitter.controller;

import com.chandrika.expense_splitter.model.User;
import com.chandrika.expense_splitter.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    /*
    * private
    It's only accessible inside this class (UserController).

    We don't want anyone outside messing with it.

    final
    Means: once assigned, it can’t be changed.

    We’re telling Spring: “Inject this once, and leave it alone.”

    It also helps avoid bugs where someone accidentally reassigns it.
    */
    private final UserRepository userRepository;
    //create User
    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }
    //getAllUsers
    @GetMapping
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    //getUserByID
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserByID(@PathVariable String id) {
        return userRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }
}
