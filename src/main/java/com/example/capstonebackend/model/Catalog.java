package com.example.capstonebackend.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "catalog", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "catalog")
    private Set<Store> stores;



    public Catalog(Long id, Set<Store> stores) {
        this.id = id;
        this.stores = stores;
    }

    public Catalog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Store> getStores() {
        return stores;
    }

    public void setStores(Set<Store> stores) {
        this.stores = stores;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id=" + id +
                ", stores=" + stores +
                '}';
    }
}
