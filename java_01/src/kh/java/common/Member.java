package kh.java.common;

import java.util.Date;

public class Member {

	private String name;
	private int age;
	private Date enrollDate;
	private boolean existCard;
	private double score;
	private static int currentCount;
	public static final int MAX_P_CLASS_COUNT = 23;
	
	public Member() {
		currentCount = currentCount+1;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", enrollDate=" + enrollDate + ", existCard=" + existCard
				+ ", score=" + score + "]";
	}
	public String getName() { // get: 읽어줘. 알고싶어. (매개인자 필요X, return 필요O)
		return name;
	}
	public void setName(String name) { // set: 넣어줘 (매개인자 필요O, return 필요X)
		this.name = name; // this 객체 사용 -> m1과 m2 구분
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	public boolean isExistCard() {
		return existCard;
	}
	public void setExistCard(boolean existCard) {
		this.existCard = existCard;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public static int getCurrentCount() {
		return currentCount;
	}
//	public void setCurrentCount(int currentCount) {
//		this.currentCount = currentCount;
//	}

	}
