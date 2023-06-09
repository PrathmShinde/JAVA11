/*
 *
 * InputOutput in java 03-04
 * IOException
 * trial & error
 *
 * Wrapper classes	
 * Integer(class) ---> In Integer Wrapper class "parseInt" (static method) method is present
 * Float
 * Double
 *
 */


import java.io.*;

class ConnectionBuffer {

	public static void main(String[] args) throws IOException {

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));	//Stream(Pipeline)

		System.out.println("Enter three Numbers : ");

		int a = Integer.parseInt(br1.readLine());

		String x = br1.readLine();

		int b = Integer.parseInt(x);

		float c = Float.parseFloat(br1.readLine());

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		System.out.println("a+b = " +(a+b));  // remove a one bracket and observe the error 
		System.out.println("a-b = " +(a-b));  // error yet ahe karn ki ethe a & b la punha string mdhe convert kel jat aahe.yabbdl sir string topic mdhe detail
		System.out.println("a*b = " + a*b);   // mdhe bolnar aahet.
		System.out.println("a/b = " + a/b);

	}
}
