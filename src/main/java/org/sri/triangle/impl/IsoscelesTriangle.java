package org.sri.triangle.impl;

import org.sri.triangle.Triangle;

/**
 * Isosceles triangle class which has properties
 * and information related to isosceles triangle
 * @author sricharan
 *
 */
public class IsoscelesTriangle extends Triangle{

	public static final String TYPE = "isosceles";
	
	public IsoscelesTriangle(double sideA, double sideB, double sideC){
		super(sideA, sideB, sideC);
	}

	@Override
	public String toString() {
		return "IsoscelesTriangle [sideA=" + getSideA() + ", sideB=" + getSideB() + ", sideC="
				+ getSideC() + "]";
	}

	@Override
	protected String getType() {
		return TYPE;
	}
}
