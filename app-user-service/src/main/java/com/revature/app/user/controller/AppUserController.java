package com.revature.app.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.app.user.repos.AppUserRepo;
import com.revature.entity.AppUser;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AppUserController {

	@Autowired
	private AppUserRepo userRepo;

	@RequestMapping
	public List<AppUser> findAll() {
		List<AppUser> users = userRepo.findAll();
		return users;
	}

}
