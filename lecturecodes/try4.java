
import java.io.*;

class Array {

	static public void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Plane :");	
		int plane = Integer.parseInt(br.readLine());
		
		System.out.println("Enter row :");	
		int row = Integer.parseInt(br.readLine());
		
		System.out.println("Enter col :");	
		int col = Integer.parseInt(br.readLine());
		
		int marr[][][] = new int[plane][row][col];

		System.out.println(int.getClass());

		for(int i = 0; i<plane; i++) {

			for(int j = 0; j<row; j++) {

				for(int k = 0; k<col; k++) {

					marr[i][j][k] = Integer.parseInt(br.readLine());
				}
			}
		}

		System.out.println();

		for(int i = 0; i<plane; i++) {

			if(i==1) {
                                System.out.println("2nd plane are : "); //do changes here also do trial and error
                        }
                        else if(i==2) {
                                System.out.println("3rd plane are : ");
			}
			for(int j = 0; j<row; j++) {

				for(int k = 0; k<col; k++) {

					System.out.print(marr[i][j][k] + " ");
				}
					System.out.println();
			}
		}
	}
}
