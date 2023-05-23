package q2445;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		
		for(int i=0;i<num;i++) {
			//별 만들기;
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			//빈 공간
			for(int k=2;k<2*num-i;k++) {
				System.out.print("?");
			}
			sc.close();
			System.out.println();
		}

	}

}
