package kr.co.eunsik;

public class VarEx2 {

	public static void main(String[] args) {

		int x = 4, y = 2;
		int tmp;
		
		tmp = x;  // 1. x의 값을 tem에 저장
		x = y;    // 2. y의 값을 x에 저장
		y = tmp;  // 3. tmp의 값을 y에 저장
		
		System.out.println("x=" + x);  // 2
		System.out.println("y=" + y);   // 4
		System.out.println("tmp=" + tmp);  // 4
		
		

	}

}
