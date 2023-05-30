/*
 
   lect 50
   String class Methods
   replace()

   */

class ReplaceDemo {

	public static void main(String[] args) {

		String s1 = new String("shashi");

		s1.replace('s','b');		// heap vrti navin string(object) tayar hote pn koni reference naslyamule Garbage collector yeto to object gheun jato. 

		System.out.println(s1);		//shashi

		System.out.println(s1.replace('s','b'));  //shashi
		
		s1 = s1.replace('s','k');		// 
		System.out.println(s1);	


	}
}
// internal code of replace() method
// Google search --> String class source code --> line number 2009-2034

/*
 public String replace(char oldChar, char newChar) {

        if (oldChar != newChar) {

            int len = value.length;

            int i = -1;

            char[] val = value; // avoid getfield opcode 

            while (++i < len) {

                if (val[i] == oldChar) {

                    break;
                }
            }
            if (i < len) {

                char buf[] = new char[len];

                for (int j = 0; j < i; j++) {

                    buf[j] = val[j];
                }
                while (i < len) {

                    char c = val[i];

                    buf[i] = (c == oldChar) ? newChar : c;

                    i++;
                }
                return new String(buf, true);			//heap vrti navin string create krto.
            }
        }
        return this;
    }
*/
