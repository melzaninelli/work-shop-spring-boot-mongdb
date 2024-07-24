package com.melzaninelli.workshopmongo.resources;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melzaninelli.workshopmongo.domain.User;
import com.melzaninelli.workshopmongo.dto.UserDTO;
import com.melzaninelli.workshopmongo.service.UserService;

@RestController
@RequestMapping(value= "/users")
public class UserResource {

	
	@Autowired
	private UserService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable String id){
		User obj = service.findById(id);
		
		return ResponseEntity.ok().body(new UserDTO(obj));
	}
}
