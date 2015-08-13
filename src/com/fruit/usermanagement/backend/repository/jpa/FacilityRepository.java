package com.fruit.usermanagement.backend.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fruit.usermanagement.backend.bean.Facility;

public interface FacilityRepository extends JpaRepository<Facility, Long> {

	public List<Facility> findByName(String name);
	
	public List<Facility> findByAddress(String address);
}
