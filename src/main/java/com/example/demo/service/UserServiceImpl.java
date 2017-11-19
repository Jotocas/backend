package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepositiry;
import com.example.demo.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	protected UserRepositiry userRepositiry;

	@Override
	public User save(User user) {
		return this.userRepositiry.save(user);
	}
}
