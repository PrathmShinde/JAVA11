/* Array in Java 
 * Do trial and error
 */

class ArrayDemo {

	public static void main(String[] args){

		int jarr[] = {1,2,3,4,5}; //Array - not recommended by java

		for(int i=0;i<5;i++) {
			System.out.println(jarr[i]);	//First print above initializer list
		}
		jarr[0] = 10;
		jarr[1] = 20;
		jarr[2] = 30;
		jarr[3] = 40;
		jarr[4] = 50;

		for(int i=0;i<5;i++)
			System.out.println(jarr[i]);	//2nd time print updated initializer list
			System.out.println(jarr.getClass());
	}
}
/*
OUTPUT:
1
2
3
4
5
10
20
30
40
50
class [I
*/
