package com.revature.app.user.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entity.AppUser;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Integer> {

}
