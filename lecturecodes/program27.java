//Array in java
//Get input in array using BufferedReader and InputStreamReader(Stream Connection)

import java.io.*; 	//Packages

class UserInput {

	public static void main(String[] args) throws IOException { 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());//here, we use br.readLine() to get input from user, So thats why we throws Exception to the main and main 													//throws Exception to the JVM,and then jvm can handle that Exception.
		int[] iarr = new int[x];

		for(int i=0;i<x;i++) {
		//for(int i=0;i<iarr.length;i++) {  //To see the length of array but it does not affect on the given code

			System.out.print("Enter elements: ");
			iarr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Array Elements : ");

		for(int i=0;i<x;i++) {

			System.out.println(iarr[i]);
		}
	}
}
