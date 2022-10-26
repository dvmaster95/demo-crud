package com.example.demo.controllers;

import com.example.demo.entities.Restaurant;
import com.example.demo.repositories.RestaurantRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {
    private final RestaurantRepository restaurantRepository;
    public RestaurantController(final RestaurantRepository restaurantRepository){
        this.restaurantRepository = restaurantRepository;
    }

    @GetMapping("/restaurants")
    public Iterable<Restaurant> allRestaurant(){
        return this.restaurantRepository.findAll();
    }

    @PostMapping("/restaurants")
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant){
        return this.restaurantRepository.save(restaurant);
    }
}
