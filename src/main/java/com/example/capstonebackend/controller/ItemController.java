package com.example.capstonebackend.controller;

import com.example.capstonebackend.model.Item;
import com.example.capstonebackend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/items")
    public ResponseEntity<List<Item>> getAllItems(){
        List<Item> items = itemRepository.findAll();
        return ResponseEntity.ok().body(items);
    }

    @GetMapping("/items/vegetables")
    public ResponseEntity<List<Item>> getAllVegetable(){
        List<Item> vegetables = itemRepository.findAllVegetable();
        return ResponseEntity.ok().body(vegetables);
    }

//
//    @GetMapping("/items/wellbeing")
//
//    @GetMapping("/items/drinks")
//
//    @GetMapping("/items/dairy")
//
//    @GetMapping("/items/toiletries")
//
//    @GetMapping("/items/fruit")
//
//    @GetMapping("/items/bakery")
//
//    @GetMapping("/items/meat")









    @PostMapping("/items")
    public ResponseEntity<Item> createItem(@RequestBody Item item){
        Item result = itemRepository.save(item);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/items/{id}")
    public String deleteById(@PathVariable Long id){
        itemRepository.deleteById(id);
        return "Item deleted";
    }



}
