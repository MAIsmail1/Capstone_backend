package com.example.capstonebackend.repository;

import com.example.capstonebackend.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query(value = "SELECT * FROM ITEM WHERE CATEGORY = 'Vegetable'", nativeQuery = true)
    List<Item> findAllVegetable();

    @Query(value = "SELECT * FROM ITEM WHERE CATEGORY = 'WellBeing'", nativeQuery = true)
    List<Item> findAllWellbeing();

    @Query(value = "SELECT * FROM ITEM WHERE CATEGORY = 'Drink'", nativeQuery = true)
    List<Item> findAllDrink();

    @Query(value = "SELECT * FROM ITEM WHERE CATEGORY = 'Dairy'", nativeQuery = true)
    List<Item> findAllDairy();

    @Query(value = "SELECT * FROM ITEM WHERE CATEGORY = 'Toiletries'", nativeQuery = true)
    List<Item> findAllToiletries();

    @Query(value = "SELECT * FROM ITEM WHERE CATEGORY = 'Fruit'", nativeQuery = true)
    List<Item> findAllFruit();

    @Query(value = "SELECT * FROM ITEM WHERE CATEGORY = 'Bakery'", nativeQuery = true)
    List<Item> findAllBakery();

    @Query(value = "SELECT * FROM ITEM WHERE CATEGORY = 'Meat'", nativeQuery = true)
    List<Item> findAllMeat();

    @Query(value = "SELECT * FROM ITEM WHERE LOWER(NAME) LIKE %:searchInput%", nativeQuery = true)
    List<Item> searchItem(@Param("searchInput") String title);

}
