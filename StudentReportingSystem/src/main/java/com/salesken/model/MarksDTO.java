package com.salesken.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarksDTO {
	
	private Double english;
	
	private Double science;
	
	private Double maths;
	
	private Double averagePercentile;
}
