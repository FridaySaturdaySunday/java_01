package kh.java.p21;

public class TestIncDec {

	public static void main(String[] args) {

		int x = 12;
		int y = 12;

		int result1 = ++x + 10; // 전위연산자:변수의 값을 먼저 증감후 연산
		int result2 = y++ + 10; // 후위연산자:변수의 값을 연산에 사용한 후, 변수의 값을 증감

		System.out.println("x:" + x + ",result1=" + result1);
		System.out.println("y:" + y + ",result2=" + result2);
		System.out.println("y:" + y);
		
//		x:13,result1=23
//		y:13,result2=22
//		y:13
		
		
		int a = 1;
		System.out.println(a++); // 1 (변수의 값을 먼저 출력 후, 변수의 값을 증감)
		System.out.println(a); // 2
	}

}
