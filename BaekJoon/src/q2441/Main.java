package q2441;

//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int num = sc.nextInt();
//		sc.close();
//
//		for (int i = 0; i < num; i++) {
//			for(int j=5-i;j<5;j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < num - i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();

      for (int i = 1; i <= n; i++) {

         // 공백 만들기
         for (int j = i; j < n; j++) {
            System.out.print(" ");
         }

         for (int j = 0; j < 2 * i - 1; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}