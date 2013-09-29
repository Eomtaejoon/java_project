package MemberManage;
import java.util.Scanner;

public class Management  {	
	public void regsiter(String id, String name, int age) {
			
	}	
	public static void main(String[] args) {
		//Management mgt = new Management();
		//mgt.regsiter("moon", "문석재", 32);		
		//System.out.println(mgt.id);
		Scanner scan = new Scanner(System.in);
		Member[] mem = new Member[2];
		Management mgt = new Management();
		
		
		System.out.println("### 간단한 회원 관리 프로그램 ###");
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 수정");
		System.out.println("3. 회원 삭재");
		System.out.println("4. 회원 정보");
		System.out.println("5. 종료");
		System.out.print("메뉴 선택: ");
		int choice = scan.nextInt();
		
		//1번 선택했다고 가정.
		
		
	}	
		
}
