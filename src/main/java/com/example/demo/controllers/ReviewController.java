package com.example.demo.controllers;

import com.example.demo.entities.Review;
import com.example.demo.repositories.ReviewRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    private final ReviewRepository reviewRepository;

    public ReviewController(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @PostMapping("/reviews")
    public Review newReview(@RequestBody Review review){
        return this.reviewRepository.save(review);
    }

    @GetMapping("/reviews")
    public Iterable<Review> allReviews(){
        return this.reviewRepository.findAll();
    }
}
