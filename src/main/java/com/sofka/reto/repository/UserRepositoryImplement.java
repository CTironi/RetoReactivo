package com.sofka.reto.repository;

import com.sofka.reto.controller.UserController;
import com.sofka.reto.model.User;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Repository
public abstract class UserRepositoryImplement implements UserRepository {

    private static final Logger log = (Logger) LoggerFactory.getLogger(UserController.class);

    @Override
    public Mono<User> create(User user) {
        log.info(user.toString());
        Mono<User> create = Mono.just(user);
        return create;
    }

    @Override
    public Mono<User> update(User user) {
        log.info(user.toString());
        Mono<User> update = Mono.just(user);
        return update;
    }

    @Override
    public Flux<User> list() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"Pepe"));
        userList.add(new User(2,"Eddi"));
        userList.add(new User(3,"Juan"));


        return Flux.fromIterable(userList);
    }

    @Override
    public Mono<User> listUserID(Integer id) {
        Mono<User> listUserID = Mono.just(new User(1, "Pepe"));
        return listUserID;
    }

    @Override
    public Mono<Void> delete(Integer id) {
        Mono<Void> delete = Mono.empty();

        return delete;
    }
}
