package q3052;

import java.util.Scanner;

class Main {   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[10];
      int cnt = 0;
      
      for(int i=0; i<arr.length; i++) {
         arr[i] = sc.nextInt()%42;
      }
      
      for(int i=0; i<arr.length; i++) {
         int tmp = 0;
         for(int j=i+1; j<arr.length; j++) {
            if(arr[i]==arr[j]) {
               tmp++;
            }
         }
         if(tmp == 0) {
            cnt++;
         }
      }
      sc.close();
      System.out.println(cnt);
   }
}