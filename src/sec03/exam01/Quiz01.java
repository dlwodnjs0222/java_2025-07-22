package sec03.exam01;

public class Quiz01 {

	public static void main(String[] args) {
		// x, y 값 초기화
		int x = 10;
		int y = 20;
		
		System.out.println("x의 값은 "+ x + "\n" + "y의 값은 "+ y + "\n");
		
		//z 변수는 임시 변수
		int z = x;
		x = y;
		y = z;
		System.out.println("x의 값은 "+ x + "\n" + "y의 값은 "+ y);
	}

}
