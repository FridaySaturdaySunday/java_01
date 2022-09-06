package kh.java.exception;

public class Run {

	public static void main(String[] args) {

		MyCharCheckExceptionTest a = new MyCharCheckExceptionTest();
		
		try {
			a.method();
		} catch (MyCharCheckException e) {
			e.printStackTrace();
		}
		
	}

}
