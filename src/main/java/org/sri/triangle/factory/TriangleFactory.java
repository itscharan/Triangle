package org.sri.triangle.factory;

import org.sri.triangle.Triangle;
import org.sri.triangle.impl.EquilateralTriangle;
import org.sri.triangle.impl.IsoscelesTriangle;
import org.sri.triangle.impl.ScaleneTriangle;

public class TriangleFactory {
	
	private TriangleFactory(){
		//Empty constructor
	}
	
	public static Triangle createTriangle(double sideA, double sideB, double sideC){
		
		if(!Triangle.isValidTriangle(sideA, sideB, sideC)){
			//Log exception 
			return null;
		}
		
		if(Double.compare(sideA, sideB) == 0 && Double.compare(sideB, sideC) == 0 ){
			return new EquilateralTriangle(sideA, sideB, sideC);
		} else if(Double.compare(sideA, sideB) == 0 || Double.compare(sideB, sideC) == 0|| Double.compare(sideA, sideC) == 0){
			return new IsoscelesTriangle(sideA, sideB, sideC);
		} 
		return new ScaleneTriangle(sideA, sideB, sideC);
	}

}
