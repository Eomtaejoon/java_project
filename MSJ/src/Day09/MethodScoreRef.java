package Day09;
import java.util.Scanner;
public class MethodScoreRef {	
	static void title() {
		System.out.println();
		System.out.println("===================================================");
		System.out.println("                                     성      적     표                   ");
		System.out.println("===================================================");
		System.out.println("NO\t국어\t영어\t수학\t총점\t평균\t학점");
	}	
	static void menutitle() {
		System.out.println();
		System.out.println("성적 관리 프로그램");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력 ");
		System.out.println("3. 종료 ");
		System.out.print("-> 메뉴 선택: ");
	}	
	static int inScore(double[][] score, Scanner s, int stu) {
		double tot = 0;
		System.out.println("총 학생 입력수: " + stu);
		for(int i=0; i<stu; i++) {			
			System.out.print((i+1) + "번째 학생의 국어,영어,수학 점수 입력 [90 78 87]: ");
			for(int j=0; j<3; j++) {
				score[i][j] = s.nextDouble(); 
				tot = tot + score[i][j];
			}
			score[i][3] = tot;
			score[i][4] = tot / 3;
			tot = 0;			
		}
		return 1;
	}
	static void outScore(double [][] score, int stu) {
		title();
		for(int i = 0;i < stu;i++) 	{
			System.out.print((i+1) + "\t");			
			for(int j = 0;j < 4;j++) 	{				
				System.out.printf("%.0f\t", score[i][j]);				
			}			
			System.out.printf("%.1f\t", score[i][4]);			
			if(score[i][4] >= 90) System.out.println(" A");
			else if((score[i][4] < 90) && (score[i][4] >= 80)) System.out.println(" B");
			else if((score[i][4] < 80) && (score[i][4] >= 70)) System.out.println(" C");
			else if((score[i][4] < 70) && (score[i][4] >= 60)) System.out.println(" D");
			else System.out.println(" F");				
		}		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		int student = 3; //학생 수
		int inFlag = 0; //성적 입력 여부 확인 변수 0이면 미입력, 1이면 입력
		double score[][] = new double[student][5];		
		do{		
			menutitle();			
			int choice = s.nextInt();						
			switch(choice) {
				case 1:
					inFlag = inScore(score, s, student);
					break;
				case 2:
					if( inFlag != 1 ) {
						System.out.println("점수 입력이 없습니다. !!");
						break;
					}else if( inFlag == 1){
						outScore(score, student);
						break;					
					}
				default: 
					System.out.println("메뉴를 잘못 입력함!!");
					break;		
			}
		}while(true);	
	}			

}








