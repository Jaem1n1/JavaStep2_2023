package chapter13;

import java.util.Scanner;

public class EnumMain {
	
	public enum Item { Start, Pause, Exit } // 0 , 1 , 2

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하세요[0:게임시작, 1:일시정지, 2:게임종료] :  ");
			
			int n=scan.nextInt();
			
			Item start=Item.Start; //start에 0번이 넘어옴
			Item pause=Item.Pause; //pause에 1번이 넘어옴
			Item exit=Item.Exit; //exit에 2번이 넘어옴
			
			if(n==start.ordinal()) { //n == 0
				System.out.println("게임이 시작되었습니다.");
			} else if(n==pause.ordinal()) { //n == 1
				System.out.println("게임이 일시정지 되었습니다.");
			} else {
				System.out.println("게임이 종료되었습니다.");
				return;
			}
		}

	}

}
