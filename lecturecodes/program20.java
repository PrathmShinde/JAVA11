/*
 * Arrray in java - 01
 * do trail and error
 * Array without using new 
 */

/*
class ArrayDemo {

	public static void main(String[] args) {

		int jarr[5] = {10,20,30,40,50};   //Observe the error

	}
}
*/
/*
class ArrayDemo {

	public static void main(String[] args) {

		int jarr[] = {10,20,30,40,50};

		 jarr[0] = 10; 
		 jarr[1] = 10;
		 jarr[2] = 10;
		 jarr[3] = 10;
		 jarr[4] = 10;

	}
}

*/
/* Note: 1. Java mhnt ki ashya type cha(Array without using new) array kdhich bnvu nka.karn java Object oriented goshti support krt mhnun java mhnt Array suddha 
 *          Object type cha ch asava.
 *	 2. Ya array cha Adress nahi bghta yet(without new use kelymule), jr 'Array using new' asa use kela asta tr tyache adress bghta yetat.
 *	 3. This way is not recommended by JAVA.
 *
 */

class ArrayDemo {

	public static void main(String[] args) {

		int jarr[] = {};

		 jarr[0] = 10; //Error will be ocuurred on this line 
		 jarr[1] = 10;
		 jarr[2] = 10;
		 jarr[3] = 10;
		 jarr[4] = 10;

	}
}
