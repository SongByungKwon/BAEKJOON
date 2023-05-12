package q2443;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		//실행(1)
		for(int i=1; i<=num; i++) {
			//공간 만들기
			for(int j=i; j<num; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i-1;j++) {
				System.out.print("*");
			}
			if(i<=num) {
				System.out.println();
			}
			
			
		}
		//실행(2)
		for(int i=2; i<=num;i++) {
			//공간 만들기
			for(int j=i-2;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=i;k<2*num-i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
