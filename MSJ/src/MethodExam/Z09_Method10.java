package MethodExam;
import java.util.Scanner;
public class Z09_Method10 {
	
	static boolean guguDan(int sDan, int eDan) {		
		if( sDan >= eDan) {
			System.out.println("�������� ������ �߸� �Է��Ͽ����ϴ�.");
			return false;
		}
		else {			
			for(int i=1; i<=9; i++) {			
				for(int j=sDan; j<=eDan; j++) {
					
					System.out.printf("%d*%d=%2d  ", j, i, i*j);
				}
				System.out.println();
			}
			return true;
		} 						
	}		
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);		
		System.out.print("���� �� �Է�: ");
		int s = scan.nextInt();
		
		System.out.print("�� �� �Է�: ");
		int e = scan.nextInt();
		
		boolean result = guguDan(s, e);		
		if( result ) 
			System.out.println("������ ��� �Ϸ�");
		else 
			System.out.println("������ ����");
			

	}

}










