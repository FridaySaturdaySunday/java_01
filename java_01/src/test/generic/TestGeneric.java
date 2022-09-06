package test.generic;

public class TestGeneric {

	public static void main(String[] args) {

		GenericEx<Integer, String> ex1 = new GenericEx<Integer, String>();
		
		ex1.setObj(24);
		
		int a1 = ex1.getObj();
	
	}

}
