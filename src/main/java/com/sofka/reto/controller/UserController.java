package com.sofka.reto.controller;

import com.sofka.reto.model.User;
import com.sofka.reto.repository.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger log = (Logger) LoggerFactory.getLogger(UserController.class);

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
