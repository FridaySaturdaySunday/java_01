package kh.java.common;

import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestApi {

	public static void main(String[] args) {

		// .split() : 괄호 안의 것을 기준으로 문자열 쪼갬
		String str = "a, b, cd,e f,g h";
		String[] arr = str.split(",");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		
		
		// StringTokenizer : split()와 같은 기능. 쪼개진 애들을 Token에 저장
		System.out.println("===== StringTokenizer =====");
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()); // nextToken() : 꺼내서 버림
		}
		// 더 이상 st 안에 아무것도 없음
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement()); // 그래서 여기서 아무것도 출력되지않음
		}
		
		
		
		// getClass() : 대상 클래스의 정보 반환
		Class cls = st.getClass();
//		Class<? extends StringTokenizer> cls = st.getClass(); // 노란밑줄 통해서 이렇게 자동완성해도됨
		
		Class<? extends String[]> cls2 = arr.getClass();
		
		System.out.println(cls.getName()); // StringTokenizer
		System.out.println(cls2.getName()); // String[]
		
		Field[] fls = cls.getDeclaredFields();
		for(Field i : fls) {
			System.out.println(i);
			
			
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine(); // flush() 와 같은 효과. 버퍼비우기.
			
			
			
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
