package com.kmb.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kmb.shop.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
