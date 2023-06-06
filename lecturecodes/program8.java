/*
 *
 Trial & error( TV & waterTank Example )
 Lecture 08
 Naming conventions
 instance variable (non static variable)
 Static variable
 instance method(non static method)
 static method 

*/

// CODE 01

class SunUniverse {

	static int waterTank=1000;
	int TV = 1;

	static void display() {

		System.out.println("SunUniverse");
	}

	public static void main(String[] args) {

		display();
		System.out.println(waterTank);        //1000
		
//		System.out.println(TV);              // Error	because TV ha variable static nahiye
		
		SunUniverse k201 = new SunUniverse(); 
		System.out.println(k201.TV);          //1
	}
}


// CODE 02 
	
	class SunUniverse1 {

		static int waterTank =1000;
		int TV = 1;

		void display() {

			System.out.println("Sun Universe 1");
		}

		public static void main(String[] args) {

			System.out.println(waterTank);           //1000

			SunUniverse1 k301 = new SunUniverse1(); 
			System.out.println(k301.TV);             //1
		
			SunUniverse1 k401 = new SunUniverse1();
			System.out.println(k401.TV);             //1
		
			SunUniverse1 k501 = new SunUniverse1();
			System.out.println(k501.TV);     	 //1

			k501.TV = 0;             	//Tv ha  non static variable  mhnun TV chi value change keli tri ti fkt tya object purtich maryadit rahtey
			System.out.println(k501.TV);             //0
		
			SunUniverse1 k601 = new SunUniverse1();
			System.out.println(k601.TV);             //1
		}
	}

// CODE 03

	class SunUniverse2 {

		static int waterTank = 1000;
		int TV = 1;

		void display() {

			System.out.println("Sun Universe");
		}

		public static void main(String[] args) {

			System.out.println(waterTank);		//1000

			SunUniverse2 k201 = new SunUniverse2();
			System.out.println(k201.TV);		//1
			System.out.println(k201.waterTank);	//1000

			SunUniverse2 k301 = new SunUniverse2();	
		        System.out.println(k301.TV);		//1
			System.out.println(k301.waterTank);	//1000

			SunUniverse2 k401 = new SunUniverse2();
			System.out.println(k401.TV);		//1
			System.out.println(k401.waterTank);	//1000
		
			SunUniverse2 k501 = new SunUniverse2();
			System.out.println(k501.TV);		//1
			System.out.println(k501.waterTank);	//1000

			}
		}


// CODE 04

	class SunUniverse3 {

		static int waterTank = 1000;
		int TV = 1;

		static void display() {

			System.out.println("Sun Universe");
		}

		public static void main(String[] args) {

			System.out.println(waterTank);		//1000

			SunUniverse3 k201 = new SunUniverse3();
			System.out.println(k201.TV);		//1
			System.out.println(k201.waterTank);	//1000

			SunUniverse3 k301 = new SunUniverse3();
			System.out.println(k301.TV);		//1
			System.out.println(k301.waterTank);	//1000
	
			SunUniverse3 k401 = new SunUniverse3();
			System.out.println(k401.TV);		//1
			System.out.println(k401.waterTank);	//1000

			SunUniverse3 k501 = new SunUniverse3();
			System.out.println(k501.TV);		//1
			System.out.println(k501.waterTank);	//1000

			k501.waterTank = 0;

			System.out.println(k501.waterTank);  //0   waterTank is a static variable. Therefore when we change the value of any one object then that
			System.out.println(k201.waterTank);  //0   change is done on the rest of the object
			System.out.println(k301.waterTank);  //0
			System.out.println(k401.waterTank);  //0

			display();

		}
	}

//Note : static variable mdhe kelela change sarvanna disto To change sarvanna Disto
//pn non static variable mdhe kelela change fkt tya object purtach maryadit asto.
