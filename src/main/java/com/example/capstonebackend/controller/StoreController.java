package com.example.capstonebackend.controller;

import com.example.capstonebackend.model.Item;
import com.example.capstonebackend.model.Store;
import com.example.capstonebackend.repository.ItemRepository;
import com.example.capstonebackend.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StoreController {
    @Autowired
    private StoreRepository storeRepository;

    @GetMapping("/stores")
    public ResponseEntity<List<Store>> getAllStores() {
        List<Store> stores = storeRepository.findAll();
        return ResponseEntity.ok().body(stores);
    }

    @GetMapping("/stores/Parachute")
    public ResponseEntity<List<Store>> getAllParachute() {
        List<Store> parachute = storeRepository.findAllParachute();
        return ResponseEntity.ok().body(parachute);
    }

    @GetMapping("/stores/OnePoundStore")
    public ResponseEntity<List<Store>> getAllOnePoundStore() {
        List<Store> onepoundstore = storeRepository.findAllOnePoundStore();
        return ResponseEntity.ok().body(onepoundstore);
    }

    @GetMapping("/stores/EalingFoodandWine")
    public ResponseEntity<List<Store>> getAllEalingFoodandWine() {
        List<Store> ealingfoodandwine = storeRepository.findAllEalingFoodandWine();
        return ResponseEntity.ok().body(ealingfoodandwine);
    }

    @PostMapping("/stores")
    public ResponseEntity<Store> createItem(@RequestBody Store store) {
        Store result = storeRepository.save(store);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/stores/{id}")
    public String deleteById(@PathVariable Long id) {
        storeRepository.deleteById(id);
        return "Store deleted";
    }

}
