/*  2nd way of declaring array, witch is recommended by JAVA
 *  Array in java - 01
 *  do trail and error  
 */

class ArrayDemo {

	public static void main(String[] args) {

		int[] Shashi = new int[5];
		
		Shashi[0] = 10;
		Shashi[1] = 20;
		Shashi[2] = 30;
		Shashi[3] = 40;
		Shashi[4] = 50;

		for(int i = 0; i<5; i++) {

			System.out.println(Shashi[i]);
		}
	}
}
