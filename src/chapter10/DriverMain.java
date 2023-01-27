package chapter10;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver driver=new Driver();
		driver.drive(new Vehicle());
		driver.drive(new Bus());
		Taxi taxi=new Taxi();
		driver.drive(taxi);
//		driver.drive(new Taxi());
		

	}

}
