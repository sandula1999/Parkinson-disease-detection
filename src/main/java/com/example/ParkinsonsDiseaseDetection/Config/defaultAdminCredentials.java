package com.example.ParkinsonsDiseaseDetection.Config;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.ParkinsonsDiseaseDetection.Model.User;
import com.example.ParkinsonsDiseaseDetection.Repository.UserRepo;

import jakarta.annotation.PostConstruct;

@Component
public class defaultAdminCredentials {

	private final UserRepo userRepository;
	private final PasswordEncoder passwordEncoder;

	public defaultAdminCredentials(UserRepo userRepository, PasswordEncoder passwordEncoder) {
		super();
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@PostConstruct
	public void initDefaultAdmin() {
		User defaultUser = new User();
		defaultUser.setId(1);
		defaultUser.setName("Medica");
		defaultUser.setEmail("admin@gmail.com");
		defaultUser.setMobile("0112751489");
		defaultUser.setPassword(passwordEncoder.encode("Password"));
		defaultUser.setRole("ROLE_ADMIN");
		userRepository.save(defaultUser);
	}
	
}
