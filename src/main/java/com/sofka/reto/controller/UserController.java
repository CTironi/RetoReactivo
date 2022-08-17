package com.sofka.reto.controller;

import com.sofka.reto.model.User;
import com.sofka.reto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserRepository repository;

    @GetMapping
    public Flux<User> list() {

        return repository.list();
    }

    @GetMapping("/{id}")
    public Mono<User> listUserID(@PathVariable("id") Integer id) {
        return repository.listUserID(id);
    }

    @PostMapping
    public Mono<User> create(@RequestBody User user) {

        return repository.create(user);
    }

    @PutMapping
    public Mono<User> update(@RequestBody User user) {

        return repository.update(user);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable("id") Integer id) {
        return repository.delete(id);
    }
}
