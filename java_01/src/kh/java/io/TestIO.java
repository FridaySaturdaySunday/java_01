package kh.java.io;

import java.io.File;
import java.io.IOException;

public class TestIO {

	public static void main(String[] args) {

		String dir = "C:/data/test/files"; 
		
		
		String fileName = "a.txt"; // project폴더 바로 아래에 생김
		String fullFileName = dir + "/" + fileName;
		System.out.println(fullFileName); // C:/data/test/files/a.txt
		
		
		// mkdirs() : 경로상에 없는 디렉토리 만들기
		File f2 = new File(dir);
		f2.mkdirs();
		
		
		// createNewFile() : 파일 생성하기
		File f1 = new File(fullFileName); // 파일 '객체' 생성 (파일이 생성되는게 아님)
		try {
			f1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
