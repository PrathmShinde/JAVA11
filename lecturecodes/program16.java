/*
 * InputOutput - 06
 * lecturecode 
 * skip method
 *
 */

import java.io.*;
import java.util.*;

class PlayerInfo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Player Info ");

		System.out.print("Enter Jersy number: ");
		int jerNo = Integer.parseInt(br.readLine());

		System.out.print("Enter Grade: ");
		char grade = (char)br.read(); 
		br.skip(1);		// Do trial and error                                     

		System.out.print("Enter Player Name : ");
		String name = br.readLine();
		
		System.out.print("Enter Float Number : ");
		float avg = Float.parseFloat(br.readLine());

		System.out.println("JerNo : " + jerNo);
		System.out.println("Grade : " + grade);
		System.out.println("Name  : " + name);
		System.out.println("Avg   : " + avg);

	}
}

// do trial and error
/*

Input :

Enter Player Info : 
1
A
virat
54.55

JerNo : 1
Grade : A
Name : virat
Avg  : 54.55

*/
