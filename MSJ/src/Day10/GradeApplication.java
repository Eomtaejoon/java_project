package Day10;
import java.util.Scanner;
public class GradeApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		StdManagement smg = new StdManagement();
		
		Student std[] = new Student[50]; //student 객체 배열 선언
		
		int flag = 0;
		
		for(int i=0; i<std.length; i++) 
			std[i] = new Student(); //객체 배열에 객체 할당
		
		do {
			System.out.println();
			System.out.println("성적 관리 프로그램");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 검색 ");			
			System.out.println("4. 종료");
			System.out.print("메뉴 선택: ");
			
			int choice = scan.nextInt();
			switch( choice ) {
				case 1: 
					flag = smg.scoreInput(std, scan);
					break;
				case 2: 
					if( flag == 1 ) {
						smg.scoreOutput(std, scan);
						break;
					}
					else if( flag == 0 ) {
						System.out.println("\n== 입력된 내용이 없습니다.==");
						break;
					}				
				case 3:
					if( flag == 1 ) {
						smg.searchSrc(std, scan);
						break;
					}
					else if( flag == 0 ) {
						System.out.println("\n== 검색할 내용이 없습니다.==");
						break;
					}						
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

