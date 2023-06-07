// JVM Architecture 05
//


class Capgemini {

	/*static*/ int noOfEmployees = 200000;
        int projectCount  = 200;

	void displayProject() {

		System.out.println("Capgemini ProjectCount = " + projectCount);
	}

	 void empInfo() {

		System.out.println("Capgemini Total Employees = " +noOfEmployees);
	}
}

class TCS {

	/*static*/ int noOfEmployees = 300000;
	int projectCount = 250;

	void displayProject() {

		System.out.println("TCS Project Count = " + projectCount);
	}
	void empInfo() {

		System.out.println("TCS Total Employees = " + noOfEmployees);
	}
};

class ITCompanies {

	public static void main(String[] args) {

	Capgemini pune = new Capgemini();

	pune.projectCount = 30;	
	pune.displayProject();		//30
	pune.empInfo();			//200000
//	System.out.println(pune.projectCount);
	
	System.out.println();

	Capgemini Channai = new Capgemini();
	
	Channai.projectCount = 70;
	Channai.displayProject();	//70
	Channai.empInfo();		//200000

	System.out.println();

	TCS mumbai = new TCS();

	mumbai.projectCount = 130;
	mumbai.displayProject();	//130
	mumbai.empInfo();		//300000

	System.out.println();
	
	TCS Bengaluru = new TCS();

	Bengaluru.projectCount = 80;
	Bengaluru.displayProject();	//80
	Bengaluru.empInfo();		//300000

	}
}
