package com.cjc.main.model;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import com.cjc.main.enums.EnquiryStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	private String studentName;
	private String studentEmail;
	private long studentMobNo;
	private String studentPancard;
	private int studentAge;
	@Enumerated(EnumType.STRING)
	private EnquiryStatus enquiryStatus;
	@CreationTimestamp
	private Date registedOn;
	@OneToOne(cascade = CascadeType.MERGE.REFRESH.REMOVE.DETACH)
	private CibilDetails cibildetails;
	
}
