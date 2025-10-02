package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {
	@RequestMapping("/param/form")
	public String form() {
		return "form";
	}
	@RequestMapping("/param/save/{x}")
	public String save(Model model, @PathVariable("x") String x, @RequestParam("y") String y) {
		model.addAttribute("x", x);
		model.addAttribute("y", y);
		return "form";
	}
}
