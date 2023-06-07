// InputOutput in java 01-02
// IOException
// trial & error


import java.io.*;   //Remove this package and observe the error

class InputDemo {

	public static void main(String[] args) throws IOException {    //Remove "throws IOException" and observe the error.
	
		InputStreamReader isr = new InputStreamReader(System.in); //get input through keyboard(character by character).
		BufferedReader br = new BufferedReader(isr);           // store input in Buffer

//		System.out.println(br.readLine());
		
		String input = br.readLine();       //call readLine method of BufferedReader class.
		System.out.println(input);          // Output print on screen/monitor.

	}
}

