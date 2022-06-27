package com.example.capstonebackend.repository;

import com.example.capstonebackend.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
