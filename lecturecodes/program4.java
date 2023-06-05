/*

class C2W {

	public static void main(String[] args) {

		System.out.println("In CORE2WEB");
		display();
	}
}

class Biencaps {

	 void display() {

		System.out.println("IN BIENCAPS");
	}
}
*/

/*
class C2W {

	public static void main(String[] args) {

		System.out.println("In CORE2WEB");
		Biencaps.display();
	}
}

class Biencaps {

	void display() {

		System .out.println("IN BIENCAPS");
	}
}

*/

class C2W {

	public static void main(String[] args) {

		System.out.println("In CORE2WEB");
		Biencaps.display();
	}
}

class Biencaps {

	static void display() {

		System .out.println("IN BIENCAPS");
	}
}



// aapn static method mdhun non static method la call nahi kru shkt tyasathi aaplyala static method lihavi lagel.
// mhnunch main method chya mage static ha keyword use kelay.( jr main method chya mage aapn static nahi lihil tr jvm error deto )
