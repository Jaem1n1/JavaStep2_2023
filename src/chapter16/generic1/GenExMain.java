package chapter16.generic1;

public class GenExMain {

	public static void main(String[] args) {
		//사용자가 원하는 형태로 객체 생성
		GenEx<String> v1 = new GenEx<String>();
		v1.setValue("100");
		System.out.println(v1.getValue());
		
		//정수, 실수, 문자
		//제네릭 타입의 객체는 기본자료형(int, double, float, char)
		GenEx<Integer> v2 = new GenEx<Integer>();
		v2.setValue(100);
		System.out.println(v2.getValue());
		
		GenEx<Float> v3 = new GenEx<Float>();
		v3.setValue(100.0f);
		System.out.println(v3.getValue());
		
		GenEx<Character> v4 = new GenEx<Character>();
		v4.setValue('백');
		System.out.println(v4.getValue());

	}

}
