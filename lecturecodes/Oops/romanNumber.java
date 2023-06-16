
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RomanNo {
   public static void main(String[] var0) throws IOException {
      BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter Roman No : ");
      String var2 = var1.readLine();
      RomanNo var3 = new RomanNo();
      int var4 = var3.converteToInt(var2);
      if (var4 != -1) {
         System.out.println(var4);
      }

   }

   int converteToInt(String var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         char var4 = var1.charAt(var3);
         switch(var4) {
         case 'C':
            if (var3 == 0) {
               var2 += 100;
            } else if (var1.charAt(var3 - 1) == 'X') {
               var2 += 80;
            } else if (var1.charAt(var3) == 'C') {
               var2 += 100;
            }
            break;
         case 'D':
            if (var3 == 0) {
               var2 += 500;
            } else if (var1.charAt(var3 - 1) == 'C') {
               var2 += 300;
            } else if (var1.charAt(var3) == 'D') {
               var2 += 500;
            }
            break;
         case 'E':
         case 'F':
         case 'G':
         case 'H':
         case 'J':
         case 'K':
         case 'N':
         case 'O':
         case 'P':
         case 'Q':
         case 'R':
         case 'S':
         case 'T':
         case 'U':
         case 'W':
         default:
            System.out.println("\tThis is not Roman No. \n\tRoman No. are written in only Capital Letters");
            return -1;
         case 'I':
            ++var2;
            break;
         case 'L':
            if (var3 == 0) {
               var2 += 50;
            } else if (var1.charAt(var3 - 1) == 'X') {
               var2 += 30;
            } else if (var1.charAt(var3) == 'L') {
               var2 += 50;
            }
            break;
         case 'M':
            if (var3 == 0) {
               var2 += 1000;
            } else if (var1.charAt(var3 - 1) == 'C') {
               var2 += 800;
            } else if (var1.charAt(var3) == 'M') {
               var2 += 1000;
            }
            break;
         case 'V':
            if (var3 == 0) {
               var2 += 5;
            } else if (var1.charAt(var3 - 1) == 'I') {
               var2 += 3;
            } else if (var1.charAt(var3) == 'V') {
               var2 += 5;
            }
            break;
         case 'X':
            if (var3 == 0) {
               var2 += 10;
            } else if (var1.charAt(var3 - 1) == 'I') {
               var2 += 8;
            } else if (var1.charAt(var3) == 'X') {
               var2 += 10;
            }
         }
      }

      return var2;
   }
}
