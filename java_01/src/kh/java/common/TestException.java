package kh.java.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TestException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try { // try { } : 오류가 발생할 수 있는 코드
				System.out.println("정수를 입력하세요. (99:종료)");
				String inputValue = sc.nextLine();
				int input = Integer.parseInt(inputValue); // String -> int
				
				if(input == 99) {
					break; // while문 빠져나감
				}
				int result = 1000 / input;
				System.out.printf("1000 / %d = %d\n", input, result);
				
//				// ClassCastException
//				Parent p = new Child(); // 업캐스팅
//				((Child)p).display(); // 다운캐스팅
//				
//				// NullPointerException
//				Parent p2 = null;
//				p2.display();
				
				break; // 여기까지 오류가 발생하지 않는다면 while문 빠져나감
				
			} catch(InputMismatchException e) {
				e.printStackTrace();
				System.out.println("오류발생");
			} catch(NumberFormatException e) {
				e.printStackTrace();
				System.out.println("숫자만 입력해주세요. 문자 안됨");
			} catch(ArithmeticException e) {
				e.printStackTrace();
				System.out.println("0으로 나눌 수 없습니다. 0 이상 입력해주세요");
			} catch(Exception e) { // 다른 모든 오류
				e.printStackTrace();
				System.out.println("예기치 못한 오류가 발생했습니다. 프로그램 종료");
				sc.close();
				return; // 메소드 종료
			} finally {
				sc.close(); // return문 만나도 실행됨
			}
		}

		

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("끝!!");
	}

}
