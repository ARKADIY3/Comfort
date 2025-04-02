package com.example.Comfort.repo;

import com.example.Comfort.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepo extends JpaRepository<Orders, Long> {}
