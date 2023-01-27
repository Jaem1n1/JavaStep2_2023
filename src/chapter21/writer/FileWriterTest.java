package chapter21.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		
		try(FileWriter fw=new FileWriter("writer.txt")) {
			
//			fw.write('A'); //A
//			fw.write(65); //A
//			fw.write("65"); //65
			//배열
			char[] buf= {'B','C','D','E','F','G'};
			fw.write(buf); //배열을 한꺼번에 저장
			fw.write(buf, 2, 4); //배열의 일부분 저장
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일이 생성 되었습니다.");

	}

}
