
class StringDemo {

	public static void main(String[] args) {

		//String[] sarr = {"Ashish","Kanha","Rajesh","Rahul"};
	
		String s1 = "Core2web";
		String s2 = new String("Biencaps");

		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}

// toString() method la aapn call nahi kela tri internally Automatically call jato.
/*
 
How to check bytecode ---> javap -c <.class file>
 
check byte code and do trial and error

one bytcode for normal string and another one for Dynamic String Array(Using new)

*/
