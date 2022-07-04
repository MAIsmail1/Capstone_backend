package com.example.capstonebackend.repository;

import com.example.capstonebackend.model.Item;
import com.example.capstonebackend.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Long> {

    @Query(value = "SELECT * FROM STORE WHERE NAME = 'Parachute'", nativeQuery = true)
    List<Store> findAllParachute();

    @Query(value = "SELECT * FROM STORE WHERE NAME  = 'One Pound Store'", nativeQuery = true)
    List<Store> findAllOnePoundStore();

    @Query(value = "SELECT * FROM STORE WHERE NAME = 'Ealing Food and Wine'", nativeQuery = true)
    List<Store> findAllEalingFoodandWine();

}
