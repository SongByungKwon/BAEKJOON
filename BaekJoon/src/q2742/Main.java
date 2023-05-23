package q2742;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		for(int i =num; i>0; i--) {
			 System.out.println(i);
			 
		}
		System.out.println("------------------");
		int i=num;
		 while(i>0) {
			 System.out.println(i);
			 i--;
		 }
		 System.out.println("------------------");
		 int j=num;
		 do {
			 System.out.println(j);
			 j--;
		 }while(i>0);
	}

}