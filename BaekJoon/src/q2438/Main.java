package q2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
//		String st= "*";
//		for(int i=0; i<s;i++) {
//			System.out.println(st);
//			st=st+"*";
//		}
//
//	}
//
//}
		
		
		
		System.out.println(N);
		for(int i=0;i<N;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			}
		}
		