package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeTest {
	Shape shape=new Shape();
	@Test
	void testcomputeSquareArea() {
		assertEquals(576,shape.computeSquareArea(24));
	}
	@Test
	void testcomputeCircleArea() {
		
		assertEquals(78.5,shape.computeCircleArea(5),"Area of circle calculation is wrong");
	}
	
	@Test
	void testcomputeCircleArea_Supplier() {
		
		assertNotEquals(74.5,shape.computeCircleArea(5),()->"Area of circle calculation is wrong");
	}


}
