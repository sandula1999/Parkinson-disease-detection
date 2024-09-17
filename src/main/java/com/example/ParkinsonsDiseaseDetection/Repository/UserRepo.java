package com.example.ParkinsonsDiseaseDetection.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ParkinsonsDiseaseDetection.Model.User;



public interface UserRepo extends JpaRepository<User, Long>{
	
	public User findByEmail(String email);

}
