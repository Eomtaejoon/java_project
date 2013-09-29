package Day10;

public class ShapeApp01 {

	public static void main(String[] args) {
		
		Shape shape = new Shape();
		double res;
		
		res = shape.calcAreaCircle();
		System.out.println("반지름: "+ shape.getr() + " 원의 넓이 " + res);
		
		res = shape.calcAreaRectangle();
		System.out.println("가로: "+ shape.getd1() + " 세로: " + shape.getd2() + " 사각의 넓이 " + res);
		
		res = shape.calcTriangle();
		System.out.println("밑변: "+ shape.getd1() + " 높이: " + shape.getd2() + " 삼각의 넓이 " + res);
		
		
	}

}
