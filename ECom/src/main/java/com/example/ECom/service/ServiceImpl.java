package com.example.ECom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ECom.Repository.DaoImpl;
import com.example.ECom.pojo.UserDetails;

@org.springframework.stereotype.Service
public class ServiceImpl {
	@Autowired
	DaoImpl daoImpl;

	public List<UserDetails> getEmployee() {
		return daoImpl.findEmployee();
	}

}
