package baekjoon5;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		double C= A/(double)B;
		System.out.printf("%f",C);

	}

}
