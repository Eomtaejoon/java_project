package Day10;

public class ShapeApp01 {

	public static void main(String[] args) {
		
		Shape shape = new Shape();
		double res;
		
		res = shape.calcAreaCircle();
		System.out.println("������: "+ shape.getr() + " ���� ���� " + res);
		
		res = shape.calcAreaRectangle();
		System.out.println("����: "+ shape.getd1() + " ����: " + shape.getd2() + " �簢�� ���� " + res);
		
		res = shape.calcTriangle();
		System.out.println("�غ�: "+ shape.getd1() + " ����: " + shape.getd2() + " �ﰢ�� ���� " + res);
		
		
	}

}
