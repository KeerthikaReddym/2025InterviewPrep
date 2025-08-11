package com.keerthika.grocerly.grocerlyBackend.Controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthika.grocerly.grocerlyBackend.Repository.GroceryRepository;
import com.keerthika.grocerly.grocerlyBackend.model.Grocery;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/groceries")
public class GroceryController {
	
	private final GroceryRepository groceryRepository;
	
    public GroceryController(GroceryRepository groceryRepository) {
        this.groceryRepository = groceryRepository;
    }

    @PostMapping
    public ResponseEntity<Grocery> addGrocery(@Valid @RequestBody Grocery grocery) {
        Grocery savedGrocery = groceryRepository.save(grocery);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedGrocery);
    }
	
    @GetMapping("/getGroceryList")
    public ResponseEntity<List<Grocery>> getGrocery() {
    	
        List<Grocery> allGroceries = groceryRepository.findAll();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(allGroceries);
    }
	
    @GetMapping("/getList")
    public ResponseEntity<List<String>> getList() {
    	LocalDate now = LocalDate.now();

        // Get start of the current week (Monday)
        LocalDate startOfWeek = now.with(DayOfWeek.MONDAY);

        // Get start of next week for exclusive end
        LocalDate startOfNextWeek = startOfWeek.plusDays(7);

        List<String> List = groceryRepository.findNamesByDateToBuyBetween(startOfWeek, startOfNextWeek);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(List);
    }
	

}
