package com.kmb.shop.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Customer {
	@Id
	@GeneratedValue
	String id;
	
	String name;
	Integer age;
	String grade;
	String job;
	Integer point;
	
	@JsonIgnore
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
	List<Order> orders = new ArrayList<>();
	
}
