package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.insurance;

public interface Repository extends JpaRepository<insurance, String> {

	insurance findByMembershipType(String membership_type);

	//insurance findOne();

	

}
