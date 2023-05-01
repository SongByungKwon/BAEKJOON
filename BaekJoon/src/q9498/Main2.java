package q9498;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jum = sc.nextInt();
		jum=jum/10;
		sc.close();
		
		switch(jum) {
		case 10:
			System.out.println('A');
			break;
		case 9:
			System.out.println('A');
			break;
		case 8:
			System.out.println('B');
			break;
		case 7:
			System.out.println('C');
			break;
		case 6:
			System.out.println('D');
			break;
		default:
			System.out.println('F');
			break;	
		}
		}

	}

