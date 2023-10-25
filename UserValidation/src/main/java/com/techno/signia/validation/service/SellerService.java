package com.techno.signia.validation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techno.signia.validation.dto.SellerRequest;
import com.techno.signia.validation.entity.Seller;
import com.techno.signia.validation.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	
	public Seller createSeller(SellerRequest sellerRequest) {
		Seller seller = Seller.build(0, sellerRequest.getName(), sellerRequest.getCategory());
		return sellerRepository.save(seller);
	}

	public Seller findSellerById(int id) {
		Seller seller = sellerRepository.findBySellerId(id);
		return seller;
	}
	
}
