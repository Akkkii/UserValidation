package com.techno.signia.validation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class Seller {
	
	@Id
	@GeneratedValue
	private int sellerId;
	private String name;
	private String category;

}
