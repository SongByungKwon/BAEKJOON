package q2442;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		sc.close();
		for(int i = 0; i<num; i++) {
			///공간 만들기
			for(int j=i-1; j>=0;j-- ) {
				
				System.out.print(" ");
				
			}
			
			for(int k=i; k<2*num-(i+1);k++) {
				System.out.print("*");
			}
			System.out.println();		
		}
		
	}

}
