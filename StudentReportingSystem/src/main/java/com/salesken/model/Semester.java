package com.salesken.model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Semester {

	private int id;
	
	private int english;
	
	private int science;
	
	private int maths;
	
	
}
