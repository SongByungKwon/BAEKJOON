package q10869;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		sc.close();
		
		System.out.printf("%d\n",i1+i2);
		System.out.printf("%d\n",i1-i2);
		System.out.printf("%d\n",i1*i2);
		System.out.printf("%d\n",i1/i2);
		System.out.printf("%d\n",i1%i2);

	}

}
