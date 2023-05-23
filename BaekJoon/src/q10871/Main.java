package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 배열 수
		int num = sc.nextInt(); // 비교할거
		int mmm[] = new int[n];// 배열 칸 선언

		for (int i = 0; i < mmm.length; i++) {
			mmm[i] = sc.nextInt();
			if (mmm[i] < num) {
				System.out.print(mmm[i] + " ");
			}
		}
		sc.close();
	}
}
