package chapter09;

public class SportsCar extends Car{
	
	public void speedUp() {
		speed+=10;
		System.out.println("스포츠카의 속도를 "+speed+"만큼 올렸습니다.");
	}
	//final이므로 재정의가 안됨
//	public void stop() {
//		System.out.println("스포츠카가 멈춥니다.");
//		speed=0;
//	}

	public static void main(String[] args) {
		SportsCar ac=new SportsCar();
		ac.speedUp();
		System.out.println("현재 속도 : "+ac.speed);
		ac.stop();

	}

}
