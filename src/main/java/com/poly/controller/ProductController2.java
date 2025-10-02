package com.poly.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.poly.entity.Product;

@Controller
public class ProductController2 {
	
	@ModelAttribute("p1")
	public Product getP1() {
		return new Product("iPhone 30", 5000.0);
	}

	@GetMapping("/product/form2")
	public String form() {
		return "formbai4";
	}

	@PostMapping("/product/save2")
	public String save(Model model, Product p) {
		model.addAttribute("p2", p);
		return "formbai4";
	}

	@ModelAttribute("items")
	public List<Product> getItems() {
		return Arrays.asList(new Product("A", 1.0), new Product("B", 12.0));
	}
}
