package com.example.Comfort.repo;

import com.example.Comfort.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepo extends JpaRepository<Products,Long> {}
