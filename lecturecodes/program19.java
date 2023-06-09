
// InputOutput - 06
// lecturecode 
// StringTokenizer

import java.io.*;
import java.util.*;

class TokenDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String empDetail = br.readLine();

		StringTokenizer st = new StringTokenizer(empDetail,",");

		String token1 = st.nextToken();
		String token2 = st.nextToken();
		String token3 = st.nextToken();

		int empId = Integer.parseInt(token1);
		String empName = token2;
		float empSal = Float.parseFloat(token3);
		
		System.out.println("Empid : " +empId );
		System.out.println("EmpName : " + empName);
		System.out.println("EmpSal : " + empSal);

	}
}

//next lecture codes ---> topic: Scanner class ------> vim program35.java 
