package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.insurance;
import com.repo.Repository;

@RestController
@RequestMapping("/insurance")
public class insuranceController {
	
	
	@Autowired
	Repository rp;
	
	@RequestMapping("/findall")
    @ResponseBody
	public List<insurance> findall(){
	return rp.findAll();
	}
	

		@RequestMapping("/{membership_type}")
	 @ResponseBody
	 public <membership_type> insurance findOne(@PathVariable("membership_type") String membership_type){
		 	return rp.findByMembershipType(membership_type);		 
	 }
	
}
