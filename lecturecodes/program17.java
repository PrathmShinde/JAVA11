
// InputOutput - 06
// lecturecode 
// StringTokenizer(it is a class)
//

import java.io.*;
import java.util.*;

class TokenDemo {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter Employee Id, Employee Name, Employee Salary on a SINGLE LINE");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String empDetail = br.readLine();

		StringTokenizer st = new StringTokenizer(empDetail,",");  //remove comma and try
		
		String token1 = st.nextToken();     // all inputs are in the string format
		String token2 = st.nextToken();
		String token3 = st.nextToken();
/*
		int empId = Integer.parseInt(token1);  // we convert String to particular type of datatype 
		String empName = token2;
		float empSal = Float.parseFloat(token3);
		
		System.out.println("Empid : " + empId);
		System.out.println("EmpName : " + empName);
		System.out.println("EmpSal : " + empSal);
*/		
		System.out.println("Empid : " + token1);
		System.out.println("EmpName : " + token2);
		System.out.println("EmpSal : " + token3);

	}
}
/*
 * Take given input from user on one line : 
 * 
 * 1,Shashi,1000.00
 *
 * Output :
 * 
 * Empid : 1 
 * EmpName : Shashi 
 * EmpSal :  1000.00
 *-----------------------------------------------
 *
 * Input:
 *
 * 1,                   shashi,                         10000.00
 *
 * Output:
 *
 *  Empid : 1
 * EmpName : 						Shashi
 * EmpSal :  1000.00
 *
 * mg ha problem ksa solve kraycha ? output nit print ks kraych ??
 * Ans: trim() method Use krun. next code mdhe solution aahe
 *
 * tumhi ethe notice kel asel na tr bgha fkt string la ch problem yet aahe aani bakiche output nit yet aahet---> karn string space la suudha character smjt 
 *
 */
