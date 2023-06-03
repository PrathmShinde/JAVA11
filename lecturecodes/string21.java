/*
 
   lect 52
   StringBuffer class
   capacity();
   
   */


class StringBufferDemo {

	public static void main(String[] args)  {

		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("Shashi");
		System.out.println(sb2.length());	//6
		System.out.println(sb1.capacity());	//16
		System.out.println(sb2.capacity());	//22
	}
}
