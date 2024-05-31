package com.app.autostore.repository;

import com.app.autostore.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByName(String name);
}
