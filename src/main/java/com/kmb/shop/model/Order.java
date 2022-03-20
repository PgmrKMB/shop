package com.kmb.shop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Order {
	@Id
	@GeneratedValue
	Integer id;
	
	@ManyToOne	//현재테이블(Order)의 컬럼명		 FK테이블의 PK 컬럼명
	@JoinColumn(name = "customerId", referencedColumnName = "id") 
	Customer customer; 
	
	@Column(length = 20, nullable = false)
	String name;
	Integer count;
	String dest;
	@Temporal(TemporalType.TIMESTAMP)
	Date ordDate; 
	
}
