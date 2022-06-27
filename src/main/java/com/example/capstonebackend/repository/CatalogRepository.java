package com.example.capstonebackend.repository;

import com.example.capstonebackend.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepository extends JpaRepository<Catalog, Long> {
}
