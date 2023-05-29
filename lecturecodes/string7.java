// lect 49
// equals() method

class StringDemo {

	public static void main(String[] args) {

		String s1 = "Shashi";
		String s2 = new String("Shashi");
		String s3 = new String("Shashi");
		String s4 = new String("shashi");

		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);

		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
	}
}

//  ==  he address check krt.
//  equals() method string cha content check krt.
