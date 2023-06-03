/*
 
   lect 52
   StringBuffer class
   capacity();
   
   */

class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Biencaps");
		StringBuffer sb2 = new StringBuffer("Shashi");

		//length
		System.out.println(sb2.length());	//6

		//capacity
		System.out.println(sb2.capacity());	//22	

		//charAt
		System.out.println(sb2.charAt(3));	//s	

		//append
		sb2.append("Bagal");
		System.out.println(sb2);		//ShashiBagal

		sb2.append(28);
		System.out.println(sb2);		//ShashiBagal28

		sb2.append(sb1);
		System.out.println(sb2);		//ShashiBagal28Biencaps

		//insert() method
		sb2.insert(13,"Core2Web");
		System.out.println(sb2);		//ShashiBagal28Core2WebBiencaps

		//deleteCharAt() method
		sb2.deleteCharAt(11);
		System.out.println(sb2);		//ShashiBagal8Core2WebBiencaps
		
		sb2.delete(6,12);
		System.out.println(sb2);		//ShashiBagal8Core2WebBiencaps		n-1 vrti yeun thambto 12th index la nahi thambat

		//setLength()
		
		sb2.setLength(6);
		System.out.println(sb2);		//Shashi
		
		//reverse() method
		sb2.reverse();
		System.out.println(sb2);		//spacneiBbeW2eroCihsahS
	}
}
