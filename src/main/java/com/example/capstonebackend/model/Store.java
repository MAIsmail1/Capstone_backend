package com.example.capstonebackend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "STORE")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long opening;
    private Long closing;
    private String location;
    private String review;
    private String imagepath;
    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Item> items;

    public Store() {
    }

    public Store(Long id, String name, Long opening, Long closing, String location, String review, String imagepath, Set<Item> items) {
        this.id = id;
        this.name = name;
        this.opening = opening;
        this.closing = closing;
        this.location = location;
        this.review = review;
        this.imagepath = imagepath;
        this.items = items;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

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

    public Long getOpening() {
        return opening;
    }

    public void setOpening(Long opening) {
        this.opening = opening;
    }

    public Long getClosing() {
        return closing;
    }

    public void setClosing(Long closing) {
        this.closing = closing;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
