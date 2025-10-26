package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

 @Controller
public class HomeController {
	
	 @GetMapping("/barberia")
	    public String home() {
	        return "index"; // nombre del archivo Thymeleaf
	 }
}
