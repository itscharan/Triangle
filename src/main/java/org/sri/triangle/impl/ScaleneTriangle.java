package org.sri.triangle.impl;

import org.sri.triangle.Triangle;

/**
 * Scalene triangle class which has properties
 * and information related to scalene triangle
 * @author sricharan
 *
 */
public class ScaleneTriangle extends Triangle{
	
	public static final String TYPE = "scalene";

	public ScaleneTriangle(double sideA, double sideB, double sideC){
		super(sideA, sideB, sideC);
	}
	
	@Override
	public String toString() {
		return "ScaleneTriangle [sideA=" + getSideA() + ", sideB=" + getSideB() + ", sideC="
				+ getSideC() + "]";
	}

	@Override
	protected String getType() {
		return TYPE;
	}
}
