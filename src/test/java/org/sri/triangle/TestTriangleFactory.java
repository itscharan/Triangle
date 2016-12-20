package org.sri.triangle;

import org.junit.Test;
import org.sri.triangle.factory.TriangleFactory;
import org.sri.triangle.impl.EquilateralTriangle;
import org.sri.triangle.impl.IsoscelesTriangle;
import org.sri.triangle.impl.ScaleneTriangle;

import junit.framework.Assert;

public class TestTriangleFactory {
	
	@Test
	public void testTriangleFactory(){
		Triangle triangle = TriangleFactory.createTriangle(1, 2, 3);
		Assert.assertEquals(null, triangle);
	}
	
	@Test
	public void testInvalidTriangle1(){
		Triangle triangle = TriangleFactory.createTriangle(1, 2, -1);
		Assert.assertEquals(null, triangle);
	}
	
	@Test
	public void testInvalidTriangle2(){
		Triangle triangle = TriangleFactory.createTriangle(0, 0, 0);
		Assert.assertEquals(null, triangle);
	}
	
	@Test
	public void testEquilateralTriangle(){
		Triangle triangle = TriangleFactory.createTriangle(3, 3, 3);
		Assert.assertEquals(EquilateralTriangle.class, triangle.getClass());
	}
	
	@Test
	public void testIsoscelesTriangle(){
		Triangle triangle = TriangleFactory.createTriangle(4, 3, 3);
		Assert.assertEquals(IsoscelesTriangle.class, triangle.getClass());
	}
	
	@Test
	public void testScaleneTriangle(){
		Triangle triangle = TriangleFactory.createTriangle(3, 4, 5);
		Assert.assertEquals(ScaleneTriangle.class, triangle.getClass());
	}
	
	@Test
	public void testEquilateralTriangleType(){
		Triangle triangle = TriangleFactory.createTriangle(3, 3, 3);
		Assert.assertEquals("equilateral", triangle.getType());
	}
	
	@Test
	public void testIsoscelesTriangleType(){
		Triangle triangle = TriangleFactory.createTriangle(4, 3, 3);
		Assert.assertEquals("isosceles", triangle.getType());
	}
	
	@Test
	public void testScaleneTriangleType(){
		Triangle triangle = TriangleFactory.createTriangle(3, 4, 5);
		Assert.assertEquals("scalene", triangle.getType());
	}
}
