//Array in java
//Get input in array using BufferedReader and InputStreamReader
//to check number is divisible by 5 or not


import java.io.*;

class UserInput {

	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int x = Integer.parseInt(br.readLine());

	int iarr[] = new int [x];

	for(int i=0;i<x;i++) {

		System.out.print("Enter Elements : ");
		iarr[i] = Integer.parseInt(br.readLine());
	}

	System.out.println("Elements are : ");

	for(int i=0;i<x;i++) {

		if(iarr[i] % 5 == 0)
			System.out.println(iarr[i] + " is divisible by 5");
		else
			System.out.println(iarr[i] + " is not divisible by 5");
		}
	}
}
