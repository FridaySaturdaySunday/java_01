package kh.java.p15;

import java.util.Date;
import java.util.Scanner;

import kh.java.common.Member;

public class TestUsingVariable {

	public static void main(String[] args) {
		
		System.out.println(Member.getCurrentCount()); // 초기값:0명
				
		int currentCount = Member.getCurrentCount(); // 1명 증가
		if(currentCount < Member.MAX_P_CLASS_COUNT) {
			Member m1 = new Member();
			m1.setName("ejkim");
			m1.setAge(23);
			m1.setEnrollDate(new Date());
			m1.setExistCard(true);
			m1.setScore(45);
			System.out.println("m1: " + m1);	
		} else {
			System.out.println("본 강좌는 마감되었습니다.");
		}
		System.out.println(Member.getCurrentCount());// 총 1명
		
		currentCount = Member.getCurrentCount(); // 1명 증가
		if(currentCount < Member.MAX_P_CLASS_COUNT) {
			Member m2 = new Member();
			m2.setName("박민지");
			m2.setAge(24);
			m2.setEnrollDate(new Date());
			m2.setExistCard(false);
			m2.setScore(78);
			System.out.println("m2: " + m2);
		} else {
			System.out.println("본 강좌는 마감되었습니다.");
		}
		System.out.println(Member.getCurrentCount()); // 총 2명

		
//		Scanner sc = new Scanner(System.in); 
//		
////		String a1 = sc.nextLine();
////		String a2 = sc.next();
////		String a3 = sc.next();
//		
//		int a1 = sc.nextInt();
//		double a2 = sc.nextDouble();
//		double a3 = sc.nextInt(); // 자동형변환
//		a1 = (int)a3; // 강제형변환
//		
////		int a4 = 129;
////		byte a5 = (byte)a4;
////		System.out.println("a5:"+a5); //데이터 오버플로우. -127 나옴
//		
//		System.out.println("a1:"+a1);
//		System.out.println("a2:"+a2);
//		System.out.println("a3:"+a3);
//		
//		System.out.print("가격을 입력해 주세요");
//		int price = sc.nextInt();
//		System.out.print("수량을 입력해 주세요");
//		int quantity = sc.nextInt();
//		
////		int price = 2500, quantity = 3; // 같은 자료형일때 한 줄에 작성 가능
//		int totalPrice = price * quantity;
//		
//		System.out.println("가격 : "+price+"원, 수량 : "+quantity+"개");
//		System.out.println("총 구매가격 : "+totalPrice+"원");
//		
//		sc.close();
	}
}
