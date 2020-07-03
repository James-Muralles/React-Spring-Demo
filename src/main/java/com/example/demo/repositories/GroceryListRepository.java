package com.example.demo.repositories;

import com.example.demo.model.GroceryList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryListRepository extends JpaRepository<GroceryList, Integer> {
}
