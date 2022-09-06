package kh.java.common;

public class BubbleSort {

	public static void main(String[] args) {

		int[] bubble = new int[] {8,1,2,5,3};
		
		System.out.println("== 원래 배열 ==");
		for(int i=0; i<bubble.length; i++) {
			System.out.print(bubble[i]);
			if(i<bubble.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();

//		m	i
//		0	0,1,2,3
//		1	0,1,2
//		2	0,1
//		3	0
		
		for (int m=0; m<bubble.length-1; m++) { // m<bubble.length-1
			for (int i=0; i<bubble.length-1-m; i++) { // i<bubble.length-1-m
				// 내림차순 정렬
				// if(bubble[i] < bubble[i+1]) {
				// 오름차순 정렬
				if(bubble[i] > bubble[i+1]) {
					swap(bubble[i], bubble[i+1]);
//					//swap
//					int temp = bubble[i];
//					bubble[i] = bubble[i+1];
//					bubble[i+1] = temp;
				}
			}
		}
		
		System.out.println("== 바뀐 배열 ==");
		for(int i=0; i<bubble.length; i++) {
			System.out.print(bubble[i]);
			if(i<bubble.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	} // main
	
	public static void swap(int a, int b) {
		
		//swap
		int temp = a;
		a = b;
		b = temp;
		
		
	}

} // class

























