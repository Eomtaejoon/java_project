package Day10;
import java.util.Scanner;
public class ShapeApp02 {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Shape shape = new Shape();
		dataIN datain = new dataIN(); //데이터 입력 받는 객체
		
		do {
			System.out.println();
			System.out.println("== Shape Program ==");
			System.out.println("1. 사각형");
			System.out.println("2. 삼각형");
			System.out.println("3. 원 ");			
			System.out.println("4. 종료");
			System.out.print("메뉴 선택: ");
			
			int choice = scan.nextInt();
			double x,y,r,res;	
			switch( choice ) {
				case 1: 
					x = datain.valueIn(scan);
					y = datain.valueIn(scan);					
					shape.setD(x, y);
					res = shape.calcAreaRectangle();					
					System.out.println("가로: "+ shape.getd1() + 
							" 세로: " + shape.getd2() + " 사각의 넓이 " + res);
					break;
				case 2: 
					x = datain.valueIn(scan);
					y = datain.valueIn(scan);				
					
					shape.setD(x, y);
					res = shape.calcTriangle();					
					System.out.println("밑변: "+ shape.getd1() + 
							" 높이: " + shape.getd2() + " 삼각의 넓이 " + res);
					break;					
				case 3:
					r = datain.valueIn(scan);					
					shape.setR(r);					
					res = shape.calcAreaCircle();
					System.out.println("반지름: "+ shape.getr() + 
							" 원의 넓이 " + res);
					break;
					
				case 4:
					System.exit(0);
				default:
					System.out.println("~~메뉴를 다시 선택해주시기 바랍니다.~~");
					break;
			}
		}while(true);	
	}

}





