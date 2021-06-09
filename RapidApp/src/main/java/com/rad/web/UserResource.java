package com.rad.web;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rad.User;
@RestController
public class UserResource {
	@Autowired
	private UserDaoService userDao;
	
	@GetMapping("/users")
	public List<User> retrieveAll(){
		return userDao.findAll();
	}
	
	@PostMapping("/user")
	public ResponseEntity<Object> saveUser(@RequestBody User user) {
		User user1 = userDao.save(user);
		URI location =ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(user1.getUserId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping("/user/{id}")
	public User findOneUser(@PathVariable String id){
		return userDao.findOne(id);
	}
	
	
}
