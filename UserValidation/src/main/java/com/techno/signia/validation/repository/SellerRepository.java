package com.techno.signia.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techno.signia.validation.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller, Integer>{

	Seller findBySellerId(int id);

}
