

class StringDemo {

	public static void main(String[] args) {

		String s1 = "Core2Web";			//scp
		String s2 = new String ("Core2Web");	//Heap-ref scp
		String s3 = "Core2Web";			//scp
		String s4 = new String("Core2Web");	//Heap-ref scp
		String s5 =  new String("Biencaps");
		String s6 = "Biencaps";

		System.out.println(s5);
		System.out.println(s6);

		System.out.println(s5 == s6);	//false

		s5 = s5.intern();

		System.out.println(s5 == s 6);	//true

	}
}

// Diagram required...draw the diagram
