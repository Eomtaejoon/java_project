package Day09;
public class CarTestTwo {

	public static void main(String[] args) {
		Car car1 = new Car();		
		Car car2 = new Car();
		
		car1.setcarColor("�����");
		car1.setGear(9);		
		System.out.println("car1��ü: " + car1.gear);
		System.out.println("car1��ü: " + car1.carColor);
		
		car2.setcarColor("������");
		car2.setGear(7);		
		System.out.println("car2��ü: " + car2.gear);
		System.out.println("car2��ü: " + car2.carColor);
		
		

	}

}
