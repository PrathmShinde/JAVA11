/*
 
   lect 50
   StringBuffer class
   append();
   capacity();
   
   */


class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();

		System.out.println(sb);			//empty
		System.out.println(sb.capacity());	//16

		sb.append("Core2Web");			
		System.out.println(sb);			//Core2Web
		System.out.println(sb.capacity());	//16

		sb.append("Technologies");		
		System.out.println(sb);			//Core2WebTechnologies
		System.out.println(sb.capacity());	//34

		StringBuffer sb1 = new StringBuffer("Shashi");
		System.out.println(sb1);		//Shashi
		System.out.println(sb1.capacity());	//22

	}
}

// Search in the source code of StringBuffer
// and search all methods --> expand(),capacity(),ensureCapacity(),etc..
