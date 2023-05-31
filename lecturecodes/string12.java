/*
 
   lect 50
   String class Methods
   startsWith()

   */

class StartsWith {

	public static void main(String[] args) {

		String s1 = new String("Bielearn");		
		String s2 = new String("BieMedia");		
		String s3 = new String("CivicGen");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(s1.startsWith("Bie"));		
		System.out.println(s2.startsWith("Bie"));		
		System.out.println(s3.startsWith("Bie"));		
	}
}
/*

// internal code of startsWith() method
// Google search --> String class source code --> line number 1382-1398
// Return type of startsWith() method is boolean

   public boolean startsWith(String prefix, int toffset) {

        char ta[] = value;

        int to = toffset;

        char pa[] = prefix.value;

        int po = 0;

        int pc = prefix.value.length;

        // Note: toffset might be near -1>>>1.

        if ((toffset < 0) || (toffset > value.length - pc)) {

            return false;
        }
        while (--pc >= 0) {

            if (ta[to++] != pa[po++]) {
                return false;
            }
        }
        return true;
    }

   */

