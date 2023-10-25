package com.techno.signia.validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techno.signia.validation.dto.SellerRequest;
import com.techno.signia.validation.entity.Seller;
import com.techno.signia.validation.service.SellerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/seller")
public class SellerController {

	@Autowired
	private SellerService service;
	
	@PostMapping("/signup")
	public ResponseEntity<Seller> createSeller(@RequestBody @Valid SellerRequest sellerRequest){
		return new ResponseEntity<>(service.createSeller(sellerRequest), HttpStatus.CREATED);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Seller> findSellerById(int id){
		return ResponseEntity.ok(service.findSellerById(id));
	}
}
