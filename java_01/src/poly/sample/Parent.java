package poly.sample;

public class Parent {
	
	protected int num; // protected: 후손클래스까지 접근가능
	
	public void display() {
		System.out.println("부모 클래스 메소드");
	}

}
