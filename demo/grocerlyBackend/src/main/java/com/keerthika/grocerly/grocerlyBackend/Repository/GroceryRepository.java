package com.keerthika.grocerly.grocerlyBackend.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.keerthika.grocerly.grocerlyBackend.model.Grocery;

public interface GroceryRepository extends JpaRepository<Grocery, Long>{
	
	@Query("SELECT g.name FROM Grocery g WHERE g.dateToBuy >= :startDate AND g.dateToBuy < :endDate")
    List<String> findNamesByDateToBuyBetween(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);


}
