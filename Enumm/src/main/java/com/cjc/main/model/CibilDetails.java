package com.cjc.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CibilDetails
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cibilId;
	private int cibilScore;
	private int cibilremarks;
	

}
