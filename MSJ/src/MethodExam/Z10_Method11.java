package MethodExam;
import java.util.Scanner;
public class Z10_Method11 {	
	static Scanner scan = new Scanner(System.in);
	
	static boolean starPtr(int cnt) {		
		if( cnt <= 0 ) {
			System.out.println("0�� ������ ������� ����� �� ����.");
			return false;
		}else {
			for(int i=0; i<cnt; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			return true;
		}		
	}
	static int instarCnt() {		
		System.out.print("�� ��� ���� �Է�: ");				
		return scan.nextInt();		
	}
	public static void main(String[] args) {		
		while(true) {				
			int sCnt = instarCnt();		
			if( starPtr(sCnt) )
				System.out.println("����� ��� �Ϸ�!");
			else 
				System.out.println("����� ��� ����!");		
			
			scan.nextLine();			
			System.out.print("��� ����Ͻðڽ��ϱ�? ");
			String ss = scan.nextLine();
			
			if( ss.equals("y") || ss.equals("Y") )
				continue;
			else			
				break;
		}
	}
}










