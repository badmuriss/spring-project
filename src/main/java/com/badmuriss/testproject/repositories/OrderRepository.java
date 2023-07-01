package com.badmuriss.testproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.badmuriss.testproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
