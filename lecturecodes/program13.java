/* 
 InputOutput in java 01-02
 IOException
 trial & error

 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(isr);

 instade of above two lines we can also write --->

 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

*/

import java.io.*;

class InputDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input1 = br.readLine();
		System.out.println(input1);

		String input2  = br.readLine();
		System.out.println(input2);

//		br.close();  // remove comment and observe error.

		String input3  = br.readLine();
		System.out.println(input3);

		br.readLine();
	}
} 
