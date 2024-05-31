package com.app.autostore.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String model;
    private Integer year;
    private String carcass;
    private String engine;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usr_id", nullable = false)
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCarcass() {
        return carcass;
    }

    public void setCarcass(String carcass) {
        this.carcass = carcass;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car() {}

    public Car(String name, String model, Integer year, String carcass, String engine, User user) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.carcass = carcass;
        this.engine = engine;
        this.user = user;
    }

    public Car(String name, Integer year, String carcass, String engine, User user) {
        this.name = name;
        this.year = year;
        this.carcass = carcass;
        this.engine = engine;
        this.user = user;
    }
}
