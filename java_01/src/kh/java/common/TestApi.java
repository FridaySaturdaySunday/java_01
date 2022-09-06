package kh.java.common;

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
	}

}