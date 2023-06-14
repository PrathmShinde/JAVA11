/* Topic : 3D Array(Three Dimentional Array)
 * Get input from user
 * do trial and erro
 *
 */

import java.io.*;

class Input3DArray {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in); //here, we creating stream connection
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter no of planes");	
		int plane = Integer.parseInt(br.readLine());

		System.out.println("Enter no of rows");
		int rows = Integer.parseInt(br.readLine());

		System.out.println("Enter no of cols");
		int cols = Integer.parseInt(br.readLine());

		int marr[][][] = new int[plane][rows][cols];

		for(int i=0;i<plane;i++) {	//loop for plane

			for(int j=0;j<rows;j++) { //loop for plane
			
				for(int k=0;k<cols;k++) { //loop for plane

				//	int a = Integer.parseInt(br.readLine());	//do trial and error here
					marr[i][j][k] = Integer.parseInt(br.readLine());
				}
			}
		}

		System.out.println("1st plane are:");

		for(int i=0;i<plane;i++) {

			if(i==1) {
				System.out.println("2nd plane are : ");	//do changes here also do trial and error
			}
			else if(i==2) {
				System.out.println("3rd plane are : ");

			}	
			for(int j=0;j<rows;j++) {

				for(int k=0;k<cols;k++) {

					System.out.print(marr[i][j][k] + " ");
				}
					System.out.println();
			}
		}
	}
}
