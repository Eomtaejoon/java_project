package Day04;
import java.util.Scanner;
public class TestIF {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String sid = "msj1568";
		String spass = "msj$1568";
		
		System.out.print("아이디 입력: ");
		String inID = s.nextLine();
		
		System.out.print("패스워드 입력: ");
		String inPASS = s.nextLine();
				 
				
		if(inID.equals(sid) && inPASS.equals(spass)) {
			System.out.println("아이디 일치와 패스워드 일치!!");
		}
		else {
			System.out.println("아이디 또는 패스워드 불일치!!");
		}
		////////////////////////////////////////////////////////////
		if(inID.equals(sid)) {						
			if( inPASS.equals(spass) ) {				
				System.out.println("로그인 되었습니다!!");				
			}
			else {
				System.out.println("패스워드가 틀렸습니다!!");
			}
		}
		else {
			System.out.println("아이디가 틀렸습니다!!");
		}
		
		
	
	}
}























