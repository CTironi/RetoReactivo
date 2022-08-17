package com.sofka.reto.repository;

import org.apache.catalina.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository {

    Mono<User> create(User user);
    Mono<User> update(User user);

    Mono<com.sofka.reto.model.User> create(com.sofka.reto.model.User user);

    Mono<com.sofka.reto.model.User> update(com.sofka.reto.model.User user);

    Flux<com.sofka.reto.model.User> list();
    Mono<com.sofka.reto.model.User> listUserID(Integer id);
    Mono<Void> delete(Integer id);
}
