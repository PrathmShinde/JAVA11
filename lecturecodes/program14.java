/*
  
 InputOutput in java 01-02
 IOException
 trial & error

 */

import java.io.*;

class ConnectionBuffer {

	public static void main(String[] args) throws IOException {

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(br1.readLine());
		System.out.println(br1.readLine());

   		br1.close();	//Observe the error

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

//		br1.close();                         // Observe the error
		System.out.println(br2.readLine());
	}
}

