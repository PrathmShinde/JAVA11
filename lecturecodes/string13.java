/*
 
   lect 50
   String class Methods
   endsWith()

   */

class endsWith {

	public static void main(String[] args) {

		String s1 = new String("Bielearn");		
		String s2 = new String("BieMedia");		
		String s3 = new String("CivicGen");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(s1.endsWith("n"));	//true	
		System.out.println(s2.endsWith("n"));	//false		
		System.out.println(s3.endsWith("n"));	//true	
	}
}
/*

// internal code of endsWith() method
// Google search --> String class source code --> line number 1428-1430
// Return type of endsWith() method is boolean

      public boolean endsWith(String suffix) {

        return startsWith(suffix, value.length - suffix.value.length);

    }
          
       
*/

