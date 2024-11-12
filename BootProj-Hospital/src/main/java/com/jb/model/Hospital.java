package com.jb.model;

import lombok.Data;

@Data
public class Hospital {
	private int hId;
	private String hName;
	private String location;
	private String contact;
	private int bedCapacity;
	private String established;
}
