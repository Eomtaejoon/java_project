package Day09;
import java.util.Scanner;
public class CarTestUser {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Car car = new Car();
		
		System.out.println("차량 변경 전");
		System.out.println("차량 색상: " + car.carColor);
		System.out.println("최대 속력: " + car.maxSpeed + "km");
		System.out.println("차량 명칭: " + car.carName);
		System.out.println("차량 기어 : " + car.gear + "단");
		System.out.println("배기량: " + car.CC + "CC");
		System.out.println("=============================");
		
		System.out.print("차량 색상 변경: ");
		String carName = scan.nextLine();				
		System.out.print("차량 기어 변경: ");
		int carGear = scan.nextInt();
		
		car.setcarColor(carName);
		car.setGear(carGear);
		
		System.out.println("차량 변경 후");
		System.out.println("차량 색상: " + car.carColor);
		System.out.println("최대 속력: " + car.maxSpeed + "km");
		System.out.println("차량 명칭: " + car.carName);
		System.out.println("차량 기어 : " + car.gear + "단");
		System.out.println("배기량: " + car.CC + "CC");
		

		
	}

}






















