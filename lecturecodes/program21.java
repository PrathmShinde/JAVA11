/*
 * Arrray in java - 01
 * do trail and error
 * Array without using new 
 * 1st way of declaring array but not recommended by JAVA
 */


class ArrayDemo {

	public static void main(String[] args) {

		int jarr[] = {};

		jarr[0] = 10; //Error will occurred on this line
		jarr[1] = 20;
		jarr[2] = 30;
		jarr[3] = 40;
		jarr[4] = 50;

		for(int i = 0; i<5; i++){

			System.out.println(jarr[i]);
		}
	}
}


/* Note:  Java ne Array la tyanna hv tsa mold krayacha try kely ani 'C' mdhe Saral margane asnarya array chi purn vat lavun takli.
 * RTE :  Sairat(Marathi movie song) --> Sadak(Hindi movie song) == Marathi song hindi mdhe mold kel ani purn song chi vat lavli.    
 *
 * Difference :
 *	1. C chya Array mdhe kahihi data dila nahi tri C smjun ghet ani Garbage value ghet
 *	2. JAVA Said Aamhi strictly boundry check krto mhnjech Array jithe smpto na tithun pudhch 1 pn element tu access nahi kru shkt
 *	3. C mdhe pudhche pn element acccess kru shkto.
 *
 *
 */
