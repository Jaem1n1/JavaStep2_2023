package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHanding2 {

	public static void main(String[] args) {
		
		FileInputStream file = null;
//		try catch사용
		try { //open
			file=new FileInputStream("a.txt"); 
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			try { //close
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Finally");
		}
		System.out.println("end");

	}

}
