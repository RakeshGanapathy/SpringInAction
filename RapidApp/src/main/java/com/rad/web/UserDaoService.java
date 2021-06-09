package com.rad.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rad.User;
@Component
public class UserDaoService {
	public static List<User> userList = new ArrayList<>();
	static {
		userList.add(new User("rakesh",(long)234325,"34srs"));
		userList.add(new User("sandy",(long)234325,"34srs"));
		userList.add(new User("chandru",(long)234325,"34srs"));
	}
	
	public List<User> findAll(){
		return userList;
	}
	
	public User save(User user) {
		userList.add(user);
		return user;
	}
	public User findOne(String id ) {
		for(User user:userList) {
			if(user.getUserId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
}
