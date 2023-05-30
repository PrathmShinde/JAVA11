/*	
	Lect 49
	compareTo()
	equalsIgnoreCase()

*/

class CompareString {

	public static void main(String[] args) {

  	  	String s1 = "Shashi";		// try Shashika string instead of Shashi
                String s2 = new String("Shashi");
                String s3 = new String("SHASHI");
  	  	String s4 = "Biencaps";  
                String s5 = new String("Bielearn");
  	  	String s6 = "Shashikant";  	// try Shashi instead of Shashikant & compare s1 & s6

                System.out.println(s1.equals(s2));	//true
                System.out.println(s2.equals(s3));	//false

		System.out.println(s1.equalsIgnoreCase(s3));	//true

		// Scenario 0 : length same,character same ----> return 0
		System.out.println(s1.compareTo(s2));		//0
		
		// Scenario 1 : length diff,character diff ----> return diff between ASCII value of diff characters
		System.out.println(s1.compareTo(s4));		// difference --> S(83)-B(66) = 17
		System.out.println(s4.compareTo(s1));		// difference --> S(66)-B(83) = -17

		// Scenario 2 : 1st check characters index by index,and if 1st string are end as compare to 2nd then ---> return count of extra Characters of 2nd string
		System.out.println(s6.compareTo(s1));		// 4
		System.out.println(s1.compareTo(s6));		// -4

		// Scenario 3 : String length Same,Half string same and half string is different
		System.out.println(s4.compareTo(s5));		// difference -->  n(110)-l(108) = 2 
		System.out.println(s5.compareTo(s4));		// difference -->  l(108)-n(110) = -2 

             }
}
