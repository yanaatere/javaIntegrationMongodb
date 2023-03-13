package com.learn.mongodb.controller;

import com.learn.mongodb.service.GroceryItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/groceryItem")
public class GroceryItemController {


    private static GroceryItemService itemService;

    @PostMapping("/insert")
    public ResponseEntity<?> insertGroceryItem(){
        itemService.createGroceryItems();
        return ResponseEntity.ok(null);
    }
}
