/*
 
   lect 50
   String class Methods
   indexOf()

*/

class IndexOf {

        public static void main(String[] args) {

                String s1 = new String("Bielearn");
                String s2 = new String("BieMedia");
                String s3 = new String("CivicGen");

		System.out.println(s1.indexOf("e"));	// 3 because Array index starts from zero
		System.out.println(s1.indexOf('e',3));		//4
		System.out.println(s1.indexOf("learn"));		//3 --> kontya index la start hotey hi string te sangt99
		System.out.println(s1.indexOf("earn",5));		//-1 --> 0 dil nahi karn 0 index la already B ha data aahe,mhnun -1 dil.
		System.out.println(s1.indexOf("earn",4));		
	}
}
