package sec03.exam01;

public class ForTest02 {

	public static void main(String[] args) {
		for(int x = 2; x < 10; x++) {
			System.out.printf("    %d단\n", x);
			for(int y = 1; y < 10; y++) {
				System.out.printf("%d X %d = %d\t\n", x, y, x*y);
			}
			System.out.println();
		}

	}

}
