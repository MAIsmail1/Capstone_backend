package com.example.capstonebackend.controller;
import com.example.capstonebackend.model.Item;
import com.example.capstonebackend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/items")
    public ResponseEntity<List<Item>> getAllItems() {
        List<Item> items = itemRepository.findAll();
        return ResponseEntity.ok().body(items);
    }

    @GetMapping("/items/vegetables")
    public ResponseEntity<List<Item>> getAllVegetable() {
        List<Item> vegetables = itemRepository.findAllVegetable();
        return ResponseEntity.ok().body(vegetables);
    }

    @GetMapping("/items/wellbeing")
    public ResponseEntity<List<Item>> getAllWellbeing() {
        List<Item> wellbeing = itemRepository.findAllWellbeing();
        return ResponseEntity.ok().body(wellbeing);
    }

    @GetMapping("/items/drinks")
    public ResponseEntity<List<Item>> getAllDrink() {
        List<Item> drinks = itemRepository.findAllDrink();
        return ResponseEntity.ok().body(drinks);
    }

    @GetMapping("/items/dairy")
    public ResponseEntity<List<Item>> GetAllDairy() {
        List<Item> dairy = itemRepository.findAllDairy();
        return ResponseEntity.ok().body(dairy);
    }

    @GetMapping("/items/toiletries")
    public ResponseEntity<List<Item>> getAllToiletries() {
        List<Item> toiletries = itemRepository.findAllToiletries();
        return ResponseEntity.ok().body(toiletries);
    }

    @GetMapping("/items/fruit")
    public ResponseEntity<List<Item>> getAllFruits() {
        List<Item> fruit = itemRepository.findAllFruit();
        return ResponseEntity.ok().body(fruit);
    }

    @GetMapping("/items/bakery")
    public ResponseEntity<List<Item>> getAllBakery() {
        List<Item> bakery = itemRepository.findAllBakery();
        return ResponseEntity.ok().body(bakery);
    }

    @GetMapping("/items/meat")
    public ResponseEntity<List<Item>> getAllMeat() {
        List<Item> meat = itemRepository.findAllMeat();
        return ResponseEntity.ok().body(meat);
    }

    @GetMapping("/search/{searchInput}")
    public ResponseEntity<List<Item>> searchItem(@PathVariable String searchInput) {
        if(searchInput != null){
            return new ResponseEntity<List<Item>>(
                    itemRepository.searchItem(searchInput), HttpStatus.OK  );
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/items")
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        Item result = itemRepository.save(item);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/items/{id}")
    public String deleteById(@PathVariable Long id) {
        itemRepository.deleteById(id);
        return "Item deleted";
    }

}
