package kh.java.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ThrowsTest{
	
	public static void main(String[] args) {
		method();
		method2();
		
//		ThrowsTest tt = new ThrowsTest(); // 객체 생성하면 밑 메소드들에 static 안붙여도됨
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		final int min = 1;
		final int max = 9;
		
		try {
			methodA(input, min, max);
		} catch (MyCharCheckException e) {
			e.printStackTrace();
			System.out.println("범위를 벗어난 값을 입력하였습니다.");
		} finally {
			System.out.println("종료");
		}
	}
	
	
	// throws : 예외 처리를 호출한 메소드에게 위임
	// throw : 예외 발생시켜줘 (보통 if문과 함께 사용)
	
	public static void methodC(int input,int min,int max) throws MyCharCheckException {
		if(input < min || input > max) {
			throw new MyCharCheckException("내가만든오류메시지"); // throw : 예외 발생시켜줘
		}
		System.out.println("정상범위 코드입니다.");
	}
	
	public static void methodB(int input,int min,int max) throws MyCharCheckException {
		methodC(input, min, max);
	}
	
	public static void methodA(int input,int min,int max) throws MyCharCheckException {
		methodB(input, min, max);
	}
	
	
	
	
	
	// try ~ catch로 예외 잡기
	
	public static void method() {
		
		BufferedReader br = null;
		
		try {
			// txt파일을 까서 버퍼에 넣어줌 -> br에 넣어줌
			br = new BufferedReader(new FileReader("C:/a.txt"));
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e){
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close(); // br의 리소스를 닫아줌
			} catch (IOException e) {} 

			
//			NullPointerException : 객체 사용 전에 참조변수가 null인지 확인
//			NullPointerException은 if문으로 막을 수 있음
//			catch (NullPointerException e) {
//				e.printStackTrace();
//			} 
		}
		System.out.println("메소드 끝");
	}
	
	
	
	
	
	// try~with~resource : 객체.close(); 처리를 try() 괄호 안에서 자동 처리
	
	public static void method2() {
		
		// txt파일을 까서 버퍼에 넣어줌 -> br에 넣어줌
		try (BufferedReader br = new BufferedReader(new FileReader("C:/a.txt")) ) {
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e){
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} 

		
		System.out.println("메소드 끝");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
