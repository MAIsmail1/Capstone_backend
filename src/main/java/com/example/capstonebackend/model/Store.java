package com.example.capstonebackend.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int opening;
    private int closing;
    private String location;
    private String review;

    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "store")
    private Set<Item> items;

    @ManyToOne
    private Catalog catalog;

    public Store(Long id, String name, int opening, int closing, String location, String review, Set<Item> items) {
        this.id = id;
        this.name = name;
        this.opening = opening;
        this.closing = closing;
        this.location = location;
        this.review = review;
        this.items = items;
    }

    public Store() {
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

    public int getOpening() {
        return opening;
    }

    public void setOpening(int opening) {
        this.opening = opening;
    }

    public int getClosing() {
        return closing;
    }

    public void setClosing(int closing) {
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

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", opening=" + opening +
                ", closing=" + closing +
                ", location='" + location + '\'' +
                ", review='" + review + '\'' +
                ", items=" + items +
                ", catalog=" + catalog +
                '}';
    }
}
