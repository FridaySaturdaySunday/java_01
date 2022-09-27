package kh.java.common;

import java.util.ArrayList; // List의 후손
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet; // Set의 후손
import java.util.List;
import java.util.Map;
import java.util.Set; 

public class TestCollection {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		// list1 자료형은 Integer List 모양입니다
		System.out.println(list1.size()); // 객체 수 리턴
		
		list1.add(12); // 객체를 맨 끝에 추가
		list1.add(23);
		list1.add(13);
		
		System.out.println(list1.size());
		
		list1.add(2, 20); // 2번 index에 20 삽입
		
		list1.remove(1); // 1번 index에 있는 객체 삭제
		
		System.out.println("====그냥 for====");
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("====enhanced for 출력====");
		for(Integer item : list1) { // list1인스턴스에서 Integer모양의 item 한 개
			System.out.println(item);
		}  // iterator와 비슷하게 동작
		
		
		System.out.println("====toString 출력====");
		System.out.println(list1);
		
		Collections.sort(list1); // 정렬
		System.out.println(list1);
		
		list1.clear(); // 모든 객체 삭제
		if(list1.isEmpty()) {
			System.out.println("list1 텅 비었음");
		}
		if(list1.size() == 0) {
			System.out.println("list1 크기 0");
		}
		
		
		
		List<String> list2 = new ArrayList<String>();
		list2.add("장혜주");
		list2.add("최지민");
		list2.add("박민지");
		list2.add("김은주");
		System.out.println(list2);
		Collections.sort(list2); // 정렬
		System.out.println(list2);
		System.out.println(list2.get(1));
		
		
		System.out.println("=========Set=========");
		Set<String> set1 = new LinkedHashSet<String>(); // Set : 저장 순서가 매번 바뀜, 중복 저장 안됨
		set1.add("장혜주");
		set1.add("최지민");
		set1.add("박민지");
		set1.add("김은주");
		set1.add("김은주");
		
		System.out.println("====Set enhanced for 출력====");
		for(String item : set1) { // set1인스턴스에서 String모양의 item 한 개
			System.out.println(item);
		}  // iterator와 비슷하게 동작
		
		System.out.println("====Set toString 출력====");
		System.out.println(set1);
		
		
		System.out.println("====Set Iterator 출력====");
		Iterator<String> a = set1.iterator(); 
		// a의 자료형은 String 모양의 Iterator입니다.
		// iterator() : 객체를 한번씩 가져옴
		// Iterator<String> : 리턴 타입
		while(a.hasNext()) { // .hasNext() : 다음에 있냐?
			String str = a.next(); // .next() : 다음에 있는거 꺼내와
			System.out.println(str);
		}
		
		List<Integer> numList = Arrays.asList(0,1,2,3,4,5); // asList : 배열을 list로 만들어줌
		System.out.println(numList);
		
		
		System.out.println("==========Map==========");
		
		// Map<키, 값>
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		
		map1.put("k1", 23);
		map1.put("k2", 24);
		map1.put("k3", 25);
		System.out.println(map1);
		System.out.println(map1.get("k2")); // get(key) : 키의 값 출력
		
		Set<String> setkey = map1.keySet(); // keySet() : (Map을) Set로 만들어서 리턴
		
		System.out.println("====Map Iterator 출력====");
		Iterator<String> itr = setkey.iterator(); 
		while(itr.hasNext()) { // .hasNext() : 다음에 있냐?
			String key = itr.next(); // .next() : 다음에 있는거 꺼내와
			System.out.printf("key:%s, value:%d\n", key, map1.get(key));
		}
		
		System.out.println("====Map enhanced for 출력====");
		for(String key : map1.keySet()) { // .keySet() 해줘야함!(enhanced for는 배열, list, set 등 가능)
			System.out.println(key);
		}
		
		// Generic : '일반적인'이라는 뜻
		// 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법
		// 데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법
		
		// asList : 배열을 가변 List로 만들어줌 (T...a)
		
		Arrays.asList(2,3,2); // 가변 리스트 (Integer...a) -> 호출하는 시점에 T가 Integer로 정해짐
		Arrays.asList(2.1,3.1,2.1); // 가변 리스트 (Double...a) 
		List<String> list3 = Arrays.asList("aa","bb","cc"); // 가변 리스트 (String...a)
		List<Member> list4 = Arrays.asList(new Member(), new Member()); // 가변 리스트 (Member...a)
		
		
		
	
	}

}






















