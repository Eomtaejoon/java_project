package Day03;
import java.util.Scanner;
public class Z12_IFexam {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("국어: ");		
		int kor = s.nextInt();
		System.out.print("영어: ");
		int eng = s.nextInt();
		System.out.print("수학: ");
		int math = s.nextInt();
		
		if( kor < 0 || eng < 0 || math < 0 ) {
			System.out.println("잘못된 점수 입력");
			System.exit(0);
		}		
		int tot = kor + eng + math;
		double avg = (double)tot / 3;
		String grade;  //학점 문자열 변수
		
		if( avg <= 100 && avg >= 90) grade = "A학점";			
		else if( avg >= 80 && avg <= 89) grade = "B학점";			
		else if( avg >= 70 && avg <= 79) grade = "C학점";			
		else if( avg >= 60 && avg <= 69) grade = "D학점";			
		else grade = "F학점";		 
			
		System.out.println("총점:" + tot + " 평균:" + avg + " 학점:" + grade);
	}

}
