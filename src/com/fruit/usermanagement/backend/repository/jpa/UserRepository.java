package com.fruit.usermanagement.backend.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fruit.usermanagement.backend.bean.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public List<User> findByLastName(String lastName);
	
	public List<User> findByFirstName(String firstName);
	
	public List<User> findByEmailAddress(String emailAddress);
	
	public List<User> findByIsAdmin(boolean isAdmin);
	
	public List<User> findByFacilityId( Long id );
	
}