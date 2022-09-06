package poly.sample;

public class Child extends Parent{

	private int x = 100;
	
	public Child () {} // 디폴트 생성자
	
	public void out() {
		System.out.println("부모의 protected num 필드 :"+num);
		System.out.println("자식 클래스 메소드");
	}
	
	@Override
	public void display() {
		super.display(); // "부모 클래스 메소드"
		System.out.println("상속받아 재정의한 메소드");
	}
}
