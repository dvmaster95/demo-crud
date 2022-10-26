package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "REVIEWS")
public class Review {
    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne
    @JoinColumn(name = "RESTAURANT_ID")
    private Restaurant restaurant;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "STATUS")
    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
