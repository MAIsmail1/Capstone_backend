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
        public ResponseEntity<List<Store>> getAllStores(){
            List<Store> stores = storeRepository.findAll();
            return ResponseEntity.ok().body(stores);
        }

        @PostMapping("/stores")
        public ResponseEntity<Store> createItem(@RequestBody Store store){
            Store result = storeRepository.save(store);
            return ResponseEntity.ok().body(result);
        }

        @DeleteMapping("/stores/{id}")
        public String deleteById(@PathVariable Long id){
            storeRepository.deleteById(id);
            return "Store deleted";
        }

}
