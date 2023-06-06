

class CoronaMaha {

	 int count = 170000;	//Non static variable

	 void precaution() {		//Jr hi method static keli tr ya mdhe count ha variable access nahi honar karn count ha non static variable aahe

		System.out.println("In precaution");
		System.out.println("Count = " + count);
	}

	 void impDecision() {	//Remove static and observe the changes

		System.out.println("CM's - Desicion");
	}

	public static void main(String[] args) {

		CoronaMaha Jun28 = new CoronaMaha();
		Jun28.precaution();
		Jun28.impDecision();

		CoronaMaha Jun29 = new  CoronaMaha();
		Jun29.count = 175000;
		Jun29.precaution();

//		CoronaMaha obj;
//		obj.precaution();

	}
}
