/*
 	Lect 49
	concat() method
	Scenario 2
*/

class ConcatDemo {

	public static void main(String[] args) {

		String s1 = "Shashi";	
		String s2 = "Bagal";

		s1 = s1.concat(s2);

		System.out.println(s1);		//ShashiBagal-heap
		System.out.println(s2);		//Bagal
	}
}
/*

#internal code of concat
Google search --> String class source code --> line number 1969-1978

--------------------------------------------
   public String concat(String str) {
        int otherLen = str.length();
        if (otherLen == 0) {
            return this;
        }
        int len = value.length;
        char buf[] = Arrays.copyOf(value, len + otherLen);
        str.getChars(buf, len);
        return new String(buf, true);
    }
--------------------------------------------
*/
