package sec03.exam01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력> ");
		String inDate = sc.nextLine();
		int x = Integer.parseInt(inDate);
		
		if(x > 90){
			System.out.println("A");
		}else if(x > 80) {
			System.out.println("B");
		}else if (x > 70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		sc.close();
	}
}
