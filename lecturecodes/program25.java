

class ArrayDemo {

	public static void main(String[] args) {

		int[] shashi = new int[5];

		shashi[0] = 10;
		shashi[1] = 20;
		shashi[2] = 30;
		shashi[3] = 40;
		shashi[4] = 50;

		for(int i=0;i<5;i++)
			System.out.println(shashi[i]);

		System.out.println(shashi.getClass()); // shashi is the object of Class [I ([I navacha 1 special class JAVA create krto)
	}
}
