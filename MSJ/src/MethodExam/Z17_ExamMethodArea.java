package MethodExam;
import java.util.Scanner;
public class Z17_ExamMethodArea {

	static double square(double w, double h) {		
		if( w == 0 || h == 0) {
			System.out.println("   ���� �Ǵ� ���� ���� �Էµ��� �ʾҽ��ϴ�.");
			return 0;
		}else {
			double area = w * h;
			return area;
		}
	}
	static double triangle(double u, double h) {
		if( u == 0 || h == 0) {
			System.out.println("   �غ� �Ǵ� ���� ���� �Էµ��� �ʾҽ��ϴ�.");
			return 0;
		}else {
			double area = (u*h) / 2;
			return area;
		}
	}
	static double circle(double r) {
		if( r == 0) {
			System.out.println("   ������ ���� �Էµ��� �ʾҽ��ϴ�.");
			return 0;
		}else {
			double area = (r*r)*3.14159265;
			return area;
		}
	}	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		int cho;
		double width, height, area, radius;
		
		do {
			System.out.println("== ���� ���ϴ� ���α׷� ==");
			System.out.println("  1. �簢�� ����");
			System.out.println("  2. �ﰢ�� ����");
			System.out.println("  3. ���� ����");
			System.out.println("  4. ����");
			System.out.print("  -> �޴� ����: ");
			cho = scan.nextInt();
			
			//�� ������ swtich case�� defalut�� ó���ص� �������. 
			if( cho < 1 || cho > 4 ) {
				System.out.println("�޴� ������ �߸��Ͽ����ϴ�.");
				System.out.println();			
				continue;
			}	
			switch(cho) {				
				case 1: //�簢��					
					System.out.print("   ���� : ");
					width = scan.nextDouble();
					System.out.print("   ���� : ");
					height = scan.nextDouble();					
					
					if( ( area = square(width, height) ) == 0 ) {	
						System.out.println();
						continue;
					}else {	
						System.out.println("   �簢�� ����: " + area);
						System.out.println();
						break;
					}			
				
				case 2: //�ﰢ��					
					System.out.print("   �غ� : ");
					width = scan.nextDouble();
					System.out.print("   ���� : ");
					height = scan.nextDouble();					
					
					if( (area = triangle(width, height) ) == 0 ) {
						System.out.println();
						continue;
					}else {						
						System.out.println("   �ﰢ�� ����: " + area);
						System.out.println();
						break;
					}					
				case 3: //��					
					System.out.print("   ������ : ");
					radius = scan.nextDouble();										
					
					if( (area = circle(radius)) == 0 ) {
						System.out.println();
						continue;
					}else {						
						System.out.println("  ������ ����: " + area);
						System.out.println();
						break;
					}					
				case 4:
					System.out.println("== ���α׷� ���� ==");
					System.exit(0);								
			}
		}while(true);
	}

}
