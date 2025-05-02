package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestException {

	@Test
	void testSortingArray_Exception() {
		try
		{
		SortingArray array=new SortingArray();
//		int unsorted[]= {2,1,4};
		int unsorted[]= null;
		int sorted[]=array.sortingArray(unsorted);
		}
//		for(int ele:sorted) {
//			System.out.println(ele);
//		}
		catch(NullPointerException e) {
			System.out.println("Exception generated");
		}
		
		
	}
	
	

}
