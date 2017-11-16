package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class UserController {
	protected UserService  userService;
	protected ObjectMapper mapper;
	
	// public RestResponse saveOrUpdate(){

}
