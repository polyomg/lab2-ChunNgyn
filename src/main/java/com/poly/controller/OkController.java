package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OkController {
	
	@ModelAttribute("userID")
	public String defaultUserID() {
	    return "123";
	}

	@RequestMapping("/ok")
	public String ok(Model model) {
		return "ok";
	}
	@PostMapping("/ctrl/ok")
	public String m1(Model model) {
		model.addAttribute("msg","Đã gọi m1()");
		return "ok";
	}
	@GetMapping("/ctrl/ok")
	public String m2(Model model) {
		model.addAttribute("msg","Đã gọi m2()");
		return "ok";
	}
	@PostMapping("/ctrl/ok/{x}")
	public String m3(@PathVariable("x") String x ,Model model) {
		model.addAttribute("msg", "Đã gọi m3()" + x);
		return "ok";
	}
}
