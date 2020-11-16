package com.example.ECom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ECom.pojo.UserDetails;
import com.example.ECom.service.ServiceImpl;

@RestController
@RequestMapping("admin")
public class Controller {
	@Autowired
	ServiceImpl serviceImpl;

	@GetMapping("getEmp")
	public List<UserDetails> createEmployee() {
		return serviceImpl.getEmployee();
	}
}
