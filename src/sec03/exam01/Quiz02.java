package sec03.exam01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력> ");
		String inputdata = sc.nextLine();
		int x = Integer.parseInt(inputdata);
		
		System.out.printf("정수 : %d\n", x);
		System.out.printf("문자열 : %s", inputdata);
		
//		if(x > 0) {
//			System.out.println( x + "는 양수이다. ");
//		}else if (x < 0) {
//			System.out.println(x + "는 음수이다. ");
//		}else {
//			System.out.println(x + "는 0이다.");
//		}
		sc.close();
	}

}
