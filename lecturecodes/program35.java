// Scanner class
// previous code ---> vim program19.java

import java.util.*;

class InputScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		char y = sc.next().charAt(0); // ghetana purn string gheto pn charAt(0) function mule fkt 1st character ch gheto.		
					      //  next() hi method Scanner class chi aahe aani next() cha return typr String aahe Ani CharAt() he String ya class ch 
					      //  function aahe. ---------- writing code like this called as Method Chaining	

		float z = sc.nextFloat();

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}

// Yeka method chya output vr dusrya method la call krta yeto yalach method chaining as mhntat
