package sec03.exam01;

public class ForTest {

	public static void main(String[] args) {
		int x = 0;
//		for(int y = 1; y <= 10; y++) {
//			x += y;
//		}
		
//		int y = 1;
//		while (y <= 10) {
//			//y++; 65 나옴
//			x += y;
//			y++; //55 나옴
//		}
		
		int y = 1;
		do {
			x += y;
			y++;
		} while (y <= 10);
		
		System.out.printf("합계: %d\n", x);

	}

}
