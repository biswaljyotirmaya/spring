package com.jb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "doct_Id")
	private Integer doctId;
	@Column(name="doct_Name",length = 25)
	private String doctName;
	@Column(name="doct_Spec",length = 25)
	private String doctSpec;
	@Column(name = "salary")
	private Double doctSal;
	
}
