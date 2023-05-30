/*
 	Lect 49
	concat() method
*/

class ConcatDemo {

	public static void main(String[] args) {

		String s1 = "Shashi";	
		String s2 = "Bagal";

		s1.concat(s2);

		// he as print kel tr string concat hot nahiye... as ka ?
		System.out.println(s1);		//ShashiBagal === Shashi
		System.out.println(s2);		//Bagal

		System.out.println(s1.concat(s2));	//ShashiBagal
	}
}

// Oracle chya site vrti string class chya code mdhe concat cha code dilela aahe to bgh
