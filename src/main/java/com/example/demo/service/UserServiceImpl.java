package com.example.demo.service;

import java.util.List;

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

	@Override
	public List<User> findAll() {
		return this.userRepositiry.findAll();
	}

	@Override
	public void deleteUser(Long id) {
		this.userRepositiry.deleteById(id);
	}
}
