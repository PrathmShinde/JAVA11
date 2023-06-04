

class ConcatDemo {

	public static void main(String[] args) {

		String s1 = "Shashi";
		String s2 = "Bagal";

		System.out.println(s1+s2);	//See bytecode and observe changes (+ suddha 2 string concat krt pn ethe performance fast asto mhnun StringBuilder la
						//													call kela jato)
	}
}
