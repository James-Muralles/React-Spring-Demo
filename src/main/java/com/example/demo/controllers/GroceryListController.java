package com.example.demo.controllers;

import com.example.demo.model.GroceryList;
import com.example.demo.repositories.GroceryListRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class GroceryListController {

    @Resource
    @Qualifier("groceryListRepository")
    GroceryListRepository groceryListRepository;

    @GetMapping(path = "/items")
    public List<GroceryList> getAllItems(){
        List<GroceryList> items = new ArrayList<>();
        groceryListRepository.findAll().forEach(items :: add);
        return items;
    }

    @PostMapping(path = "/items")
    public GroceryList addItem(@RequestBody GroceryList item){
        groceryListRepository.save(item);
        return item;
    }

    @DeleteMapping(path = "/items/{id}")
    public void deleteItem(@PathVariable int id){
        groceryListRepository.deleteById(id);
    }
}
