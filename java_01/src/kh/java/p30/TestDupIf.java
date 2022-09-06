package kh.java.p30;

public class TestDupIf {

	public static void main(String[] args) {

		int score = 89;
		String grade = "";
		
		if (score >= 90) {
			grade = "A";
			if (score >= 98) {
				grade += "+";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 88) {
				grade += "+";
			}
		} else if (score >= 70) {
			grade = "A";
			if (score >= 78) {
				grade += "+";
			}
		} else {
			grade = "F";
		}
		
		System.out.println("점수:"+score+", 학점:"+grade);
	}

}
