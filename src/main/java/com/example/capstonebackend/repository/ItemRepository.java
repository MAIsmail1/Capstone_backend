package com.example.capstonebackend.repository;

import com.example.capstonebackend.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query(value = "SELECT * FROM ITEM WHERE CATEGORY = 'Vegetable'", nativeQuery = true)
    List<Item> findAllVegetable();
}
