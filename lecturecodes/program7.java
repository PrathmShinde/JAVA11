/*
 Lecture 07
 Naming conventions
 instance variable (non static variable)
 Static variable
 instance method(non static method)
 static method 
*/

class Unacademy {

	 static int totalStudents = 100000;
	 static int studUpsc = 7000;

	 static void batchUpsc() {

		System.out.println(studUpsc);
	}

	 static void totalStudCount() {

		System.out.println(totalStudents);
	}

	public static void main(String[] args) {

		System.out.println("IN MAIN FUNCTION");

		System.out.println(totalStudents);

		batchUpsc();
		totalStudCount();
	}
}


/*  remove all static keywords and see the errors, what happened when we remove all static keywords ?
 *
 *  we cannot access non static methods, variables, (all things) from static method.
 *
 */
