package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Dtoclass;
import com.example.demo.response.Responseclass;
import com.example.demo.service.Serviceinterface;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/")


public class Controllerclass {
	@Autowired
	Serviceinterface registerservice;
	@PostMapping("/addtocart")
	public Responseclass register(@RequestBody  Dtoclass registerDto) {
		 return registerservice.register(registerDto);

}
}
