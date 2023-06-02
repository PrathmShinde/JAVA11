/*
 
   lect 50
   String class Methods
   substring();
   

*/

class IndexOf {

        public static void main(String[] args) {

		String s1 = new String("Bielearn");
                String s2 = new String("BieMedia");
                String s3 = new String("BieTickets");

		s1 = s1.substring(3);
		s2 = s2.substring(3,6);		// 3 to 5 index chi string gheto(n-1 vrti thambto)

		System.out.println(s1);
		System.out.println(s2);
	}
}
