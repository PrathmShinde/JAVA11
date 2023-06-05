// command line argument in JAVA
// trial and error

class C2W {

	static public void main(String[] s) {

		System.out.println(s.length); // print total count on command line 
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
	}
}



// In C

/* 

#include<stdio.h>

 // int main(int argc, char[][2] args) {      // why this is not working, why it gives error ?
    
   int main(int argc, char* args[]) {

	printf("%d\n",argc);
   	printf("%s\n",args[0]);
   	printf("%s\n",args[1]);
   	printf("%s\n",args[2]);
   	printf("%s\n",args[3]);

   }
 }
*/
