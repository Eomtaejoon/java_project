package Day10;
import java.util.Scanner;
public class ShapeApp02 {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Shape shape = new Shape();
		dataIN datain = new dataIN(); //������ �Է� �޴� ��ü
		
		do {
			System.out.println();
			System.out.println("== Shape Program ==");
			System.out.println("1. �簢��");
			System.out.println("2. �ﰢ��");
			System.out.println("3. �� ");			
			System.out.println("4. ����");
			System.out.print("�޴� ����: ");
			
			int choice = scan.nextInt();
			double x,y,r,res;	
			switch( choice ) {
				case 1: 
					x = datain.valueIn(scan);
					y = datain.valueIn(scan);					
					shape.setD(x, y);
					res = shape.calcAreaRectangle();					
					System.out.println("����: "+ shape.getd1() + 
							" ����: " + shape.getd2() + " �簢�� ���� " + res);
					break;
				case 2: 
					x = datain.valueIn(scan);
					y = datain.valueIn(scan);				
					
					shape.setD(x, y);
					res = shape.calcTriangle();					
					System.out.println("�غ�: "+ shape.getd1() + 
							" ����: " + shape.getd2() + " �ﰢ�� ���� " + res);
					break;					
				case 3:
					r = datain.valueIn(scan);					
					shape.setR(r);					
					res = shape.calcAreaCircle();
					System.out.println("������: "+ shape.getr() + 
							" ���� ���� " + res);
					break;
					
				case 4:
					System.exit(0);
				default:
					System.out.println("~~�޴��� �ٽ� �������ֽñ� �ٶ��ϴ�.~~");
					break;
			}
		}while(true);	
	}

}





