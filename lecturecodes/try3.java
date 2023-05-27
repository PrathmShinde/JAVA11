
import java.io.*;

class ArrayDemo {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Array Dimension");

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		int[][] iarr = new int[x][y];
		int Iarr[] = {10,20,30,40,50};
		
		float[][] farr = new float[x][y];
		float Farr[] = {10,20,30,40,50};

		System.out.println(farr.getClass());
		System.out.println(Farr.getClass());
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Elements : ");

		for(int i = 0; i<x; i++) {

			for(int j = 0; j<y; j++){

				iarr[i][j] = Integer.parseInt(br.readLine());
			}
		}

		System.out.println("Array Elements Are : ");

		for(int i = 0; i<x; i++) {

			for(int j = 0; j<y; j++) {

				System.out.print(iarr[i][j] + " ");
			}
				System.out.println();
		}
	}

}
