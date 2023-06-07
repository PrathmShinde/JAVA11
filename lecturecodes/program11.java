// JVM 
// JVM Final
// jvm Architecture Diagram
// See notebook Diagram
// Page no : 

class Core2Web {

	static int totalStudCount = 2500;
	int batchStudCount = 0;

	void dispStudCount() {

		System.out.println("totalStudCount = " + totalStudCount);	//2500		//2500
	        System.out.println("batchStudCount = "+ batchStudCount);	//370		//290
	}
}

class C2WAdmin {

 	static int totalLoginCount = 1200;
	int videoCount = 0;

	void dispStat() {

		System.out.println("TotalLoginCount = " + totalLoginCount);	//1200		//1000
		System.out.println("videoCount = " + videoCount);		///25		//150
	}
}

class Mentor {

	public static void main(String[] args) { 

		Core2Web java9_10 = new Core2Web();

		java9_10.batchStudCount = 370;
		java9_10.dispStudCount();

		Core2Web ppa5 = new Core2Web();

		ppa5.batchStudCount = 290;
		ppa5.dispStudCount();

		C2WAdmin python0 = new C2WAdmin();

		python0.videoCount = 25;
		python0.dispStat();

		python0.totalLoginCount = 1000; // Static var change

		C2WAdmin OS = new C2WAdmin();

		OS.videoCount = 150;
		OS.dispStat();
	}
}

