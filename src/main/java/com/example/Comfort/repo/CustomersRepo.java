package com.example.Comfort.repo;

import com.example.Comfort.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepo extends JpaRepository<Customers , Long> {}
