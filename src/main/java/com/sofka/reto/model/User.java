package com.sofka.reto.model;

import org.springframework.data.mongodb.core.mapping.Document;



@Document("/users")
public class User {
    private Integer userID;
    private String nombre;


    public User(Integer userID, String nombre) {
        this.userID = userID;
        this.nombre = nombre;

    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
