package Day09;
import java.util.Scanner;
public class CarTestUser {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Car car = new Car();
		
		System.out.println("���� ���� ��");
		System.out.println("���� ����: " + car.carColor);
		System.out.println("�ִ� �ӷ�: " + car.maxSpeed + "km");
		System.out.println("���� ��Ī: " + car.carName);
		System.out.println("���� ��� : " + car.gear + "��");
		System.out.println("��ⷮ: " + car.CC + "CC");
		System.out.println("=============================");
		
		System.out.print("���� ���� ����: ");
		String carName = scan.nextLine();				
		System.out.print("���� ��� ����: ");
		int carGear = scan.nextInt();
		
		car.setcarColor(carName);
		car.setGear(carGear);
		
		System.out.println("���� ���� ��");
		System.out.println("���� ����: " + car.carColor);
		System.out.println("�ִ� �ӷ�: " + car.maxSpeed + "km");
		System.out.println("���� ��Ī: " + car.carName);
		System.out.println("���� ��� : " + car.gear + "��");
		System.out.println("��ⷮ: " + car.CC + "CC");
		

		
	}

}






















