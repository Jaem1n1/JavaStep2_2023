package chapter14.Wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		//오토박싱 상황에서는 1byte 초과 시 비교판단이 안됨
		System.out.println("[-128 ~ 127 의 초과값일 경우]"); // 1byte = 8bit
		Integer obj1=300; //4byte => 32bit
		Integer obj2=300;
		
		//주소를 비교
		System.out.println("==결과== : "+(obj1==obj2)); //외부
		System.out.println("==언박싱한 후 결과== : "+(obj1.intValue()==obj2.intValue())); //내부
		//=========================================================================
		System.out.println("[-128 ~ 127 의 범위값일 경우]"); // 1byte = 8bit
		Integer obj3=100; //4byte => 32bit
		Integer obj4=100;
		
		//주소를 비교
		System.out.println("==결과== : "+(obj3==obj4)); //외부
		System.out.println("==언박싱한 후 결과== : "+(obj3.intValue()==obj4.intValue())); //내부
		System.out.println("==equals 결과== : "+obj3.equals(obj4)); //내부

	}

}
