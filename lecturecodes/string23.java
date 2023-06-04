/*
 
   Difference between StringBuffer & StringBuilder	

   */

import java.util.*;

class Difference {

	public static void main(String[] args) {

		long startTime = new GregorianCalendar().getTimeInMillis();
		long startMemory = Runtime.getRuntime().freeMemory();

//		StringBuffer sb = new StringBuffer("Shashi");
		StringBuilder sb = new StringBuilder("Shashi");

		for(int i = 1; i<10000000; i++) {

			sb.append("Hello");
		}

		long endTime = new GregorianCalendar().getTimeInMillis();
		long endMemory = Runtime.getRuntime().freeMemory();

		System.out.println("Time = " + (endTime - startTime));
		System.out.println("Memory = " + (endMemory - startMemory));
	}

}

/*

StringBuffer Class

Time = 189
Memory = -25651616

StringBuilder class (fast performance)

Time = 176
Memory = -25594800


*/
