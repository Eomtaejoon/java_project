package Day04;
import java.util.Scanner;
public class TestIF {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String sid = "msj1568";
		String spass = "msj$1568";
		
		System.out.print("���̵� �Է�: ");
		String inID = s.nextLine();
		
		System.out.print("�н����� �Է�: ");
		String inPASS = s.nextLine();
				 
				
		if(inID.equals(sid) && inPASS.equals(spass)) {
			System.out.println("���̵� ��ġ�� �н����� ��ġ!!");
		}
		else {
			System.out.println("���̵� �Ǵ� �н����� ����ġ!!");
		}
		////////////////////////////////////////////////////////////
		if(inID.equals(sid)) {						
			if( inPASS.equals(spass) ) {				
				System.out.println("�α��� �Ǿ����ϴ�!!");				
			}
			else {
				System.out.println("�н����尡 Ʋ�Ƚ��ϴ�!!");
			}
		}
		else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�!!");
		}
		
		
	
	}
}























