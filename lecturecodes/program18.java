
// InputOutput - 06
// lecturecode 
// skip method
// StringTokenizer
// trim() method
// how to get all input on a SINGLE LINE

import java.io.*;
import java.util.*;

class TokenDemo {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter EmpId, EmpName & EmpSalary On SINGLE LINE : ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String empDetail = br.readLine();

		StringTokenizer st = new StringTokenizer(empDetail,",");

		String token1 = st.nextToken().trim();
		String token2 = st.nextToken().trim();
		String token3 = st.nextToken().trim();
/*
		token1.trim();
		token2.trim(); 
		token3.trim();
*/		
		int empId = Integer.parseInt(token1);
		String empName = token2;
		float empSal = Float.parseFloat(token3);
		
		System.out.println("Empid : " + empId);
		System.out.println("EmpName : " + empName);
		System.out.println("EmpSal : " + empSal);

	}
}	
