// Lect 48
// String Constructor demo

class StringConstrDemo {

	public static void main(String[] args) {

		char name[] = {'s','h','a','s','h','i'};
		String obj = new String(name);		// String class chya Constructor la call jato --> Syntax--> String(char[]) { }
		System.out.println(obj);

		byte barr[] = {100,101,102,103,104};
		String s2 = new String(barr);		//---------------||-------------------- --> Syntax --> String(byte[]) { }
		System.out.println(s2);
	}
}

/* Four constructors
 * 1) Empty COnstrutcor
 * 2) Parameterized Constructor 
 * 3) String(Char[]) Constructor
 * 4) String(byte[]) Constructo r
 *
 *
 */
