package q2741;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		for(int i =1; i<=num; i++) {
			 System.out.println(i);
		}
		System.out.println("____________________");
		int i=1;
		while(i<=num) {
			System.out.println(i);
			i++;
		}
		System.out.println("____________________");
		int j=1;
		do {
			System.out.println(j);
			j++;
			
		}while(j<=num);
		
	}

}
