package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disease {
//	private int diagnostic_id;
//	private int disease_id;
//	private double base_value;
	private String disease_name;
	private int id;
	
public String getDiseaseName() {
	return disease_name;
}
}
