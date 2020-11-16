package com.example.ECom.Repository;

import java.util.List;

import com.example.ECom.pojo.UserDetails;

public interface Dao {
	public List<UserDetails> findEmployee();
}
