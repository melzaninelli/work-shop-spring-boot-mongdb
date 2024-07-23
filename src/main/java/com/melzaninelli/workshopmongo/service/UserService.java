package com.melzaninelli.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.melzaninelli.workshopmongo.domain.User;
import com.melzaninelli.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	
	
	
	public List<User> findAll(){
	return repo.findAll();	
	}
}
