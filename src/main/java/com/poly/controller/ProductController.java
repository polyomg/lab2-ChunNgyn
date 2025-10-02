package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	@GetMapping("/product/form")
	public String form() {
		return "formbai3";
	}
	@PostMapping("/product/save")
	public String save(@RequestParam("name") String name, @RequestParam("price") Double price, Model model) {
		model.addAttribute("name",name);
		model.addAttribute("price",price);
		return "formbai3";
	}
}
