package com.kmb.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kmb.shop.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{

}
