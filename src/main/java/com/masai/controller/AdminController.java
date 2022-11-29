package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.AdminException;
import com.masai.model.Admin;
import com.masai.service.AdminService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService as;
	
	@PostMapping("/register")
	public ResponseEntity<Admin> registerAdmin(@RequestBody Admin admin, @RequestParam(required = true) String validationKey)throws AdminException{
		Admin ad=as.registerAdmin(admin, validationKey);
		return new ResponseEntity<Admin>(ad,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/viewAllAdmin")
	public ResponseEntity<List<Admin>> viewAllAdmin(String key)throws AdminException{
		List<Admin>list=as.viewAllAdmin(key);
		return new ResponseEntity<List<Admin>>(list,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteAdmin")
	public ResponseEntity<Admin> deleteAdmin(Admin admin, String key)throws AdminException{
		Admin ad=as.deleteAdmin(admin, key);
		return new ResponseEntity<Admin>(ad,HttpStatus.ACCEPTED);
	}

}
