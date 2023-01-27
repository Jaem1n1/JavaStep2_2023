package chapter10;

//import java.util.Scanner;

public class CalculatorExamMain {

	public static void main(String[] args) {
		
		
		float n1=22.5f;
		float n2=7.5f;
		
		CalPlus calplus=new CalPlus();
		System.out.printf("CalPlus : %2.0f\n",calplus.getResult(n1, n2));
		
		CalMinus calminus=new CalMinus();
		System.out.printf("CalMinus : %2.0f",calminus.getResult(n1, n2));
		
//		Scanner s=new Scanner(System.in);
//		CalculatorExam[] calculators= {new CalPlus(), new CalMinus()};
//		
//		System.out.print("정수 A를 입력하세요 : ");
//		int a=s.nextInt();
//		System.out.print("정수 B를 입력하세요 : ");
//		int b=s.nextInt();
//		getClass().getSimpleName() : 클래스명 가져오기
//		for(CalculatorExam ce : calculators) {
//			System.out.println(ce.getClass().getSimpleName()+" : "+ce.getResult(a, b));
//		}

	}
	
//	public static int calc(CalculatorExam c1, int a, int b) {
//		return c1.getResult(a, b);
//	}

}
