package Day09;
public class CarTestTwo {

	public static void main(String[] args) {
		Car car1 = new Car();		
		Car car2 = new Car();
		
		car1.setcarColor("³ë¶õ»ö");
		car1.setGear(9);		
		System.out.println("car1°´Ã¼: " + car1.gear);
		System.out.println("car1°´Ã¼: " + car1.carColor);
		
		car2.setcarColor("°ËÀº»ö");
		car2.setGear(7);		
		System.out.println("car2°´Ã¼: " + car2.gear);
		System.out.println("car2°´Ã¼: " + car2.carColor);
		
		

	}

}
