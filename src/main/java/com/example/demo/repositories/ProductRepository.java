package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query("SELECT product FROM Product product JOIN FETCH product.categories "
			+ "WHERE product IN :products")
	List<Product> findProductsCategories(List<Product> products);
	
}
