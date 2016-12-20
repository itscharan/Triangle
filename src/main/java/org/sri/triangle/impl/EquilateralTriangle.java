package org.sri.triangle.impl;

import org.sri.triangle.Triangle;

/**
 * Equilateral triangle class which has properties
 * and information related to equilateral triangle
 * @author sricharan
 *
 */
public class EquilateralTriangle extends Triangle {

	public static final String TYPE = "equilateral";
	
	public EquilateralTriangle(double sideA, double sideB, double sideC){
		super(sideA, sideB, sideC);
	}

	@Override
	public String toString() {
		return "EquilateralTriangle [sideA=" + getSideA() + ", sideB=" + getSideB() + ", sideC="
				+ getSideC() + "]";
	}

	@Override
	protected String getType() {
		return TYPE;
	}
}
