package com.kmb.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kmb.shop.model.Customer;
import com.kmb.shop.model.Order;
import com.kmb.shop.repository.CustomerRepository;
import com.kmb.shop.repository.OrderRepository;

@Controller
public class ShopController {

	
	@Autowired
	CustomerRepository cr;
	
	@Autowired
	OrderRepository or;
	
	@GetMapping("shop1")
	@ResponseBody
	public List<Order> shop1 () {
		
		List<Order> list = or.findAll();
		return list;
	}
	
	@GetMapping("shop2")
	public String shop2 (Model model) {
		
		List<Order> list = or.findAll();
		model.addAttribute("list",list);
		
		return "shop";
	}
	
	
}
