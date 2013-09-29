package Day09;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		System.out.println("차량 색상: " + c.carColor);
		System.out.println("최대 속력: " + c.maxSpeed + "km");
		System.out.println("차량 명칭: " + c.carName);
		System.out.println("차량 기어 : " + c.gear + "단");
		System.out.println("배기량: " + c.CC + "CC");

	}

}
