package kh.java.common;

public class TV {
	
	int size;
	String manufacturer;
	
	public TV() {
		this(30, "LG"); // this() 생성자 호출 -> 반드시 첫 줄에 적어야함
		
		// this() 쓰면 아래처럼 적지 않아도 바로 3번째 생성자로 진입
//		this.size = 30;
//		this.manufacturer = "LG";
//		System.out.println("size는 "+30+", "+"LG");
	}

	public TV(String manufacturer) {
		this(30, manufacturer);
	}
	
	public TV(int size, String manufacturer) {
		super(); // 부모클래스의 생성자 -> 반드시 첫 줄에 적어야함
		this.size = size;
		this.manufacturer = manufacturer;
		System.out.println("size는 "+size+", "+manufacturer);
	}
}
