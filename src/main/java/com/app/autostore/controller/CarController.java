package com.app.autostore.controller;

import com.app.autostore.entity.Car;
import com.app.autostore.entity.User;
import com.app.autostore.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/add-car")
    public String addCar(Model model) {
        return "add-car";
    }

    @PostMapping("/add-car")
    public String addCar(@RequestParam String name, @RequestParam String model, @RequestParam Integer year, @RequestParam String carcass, @RequestParam String engine, @AuthenticationPrincipal User user) {
        Car car = new Car(name, model, year, carcass, engine, user);
        carRepository.save(car);
        return "redirect:/home";
    }
}




//    @PostMapping("/add-car")
//    public String addCar(@RequestParam String name, @RequestParam Integer year, @RequestParam String carcass, @RequestParam String engine, Model model) {
//        Car car = new Car();
//        car.setName(name);
////        car.setModel(model);
//        car.setYear(year);
//        car.setCarcass(carcass);
//        car.setEngine(engine);
//        carRepository.save(car);
//        return "redirect:/home";
//    }