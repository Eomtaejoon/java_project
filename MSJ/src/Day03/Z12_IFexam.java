package Day03;
import java.util.Scanner;
public class Z12_IFexam {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����: ");		
		int kor = s.nextInt();
		System.out.print("����: ");
		int eng = s.nextInt();
		System.out.print("����: ");
		int math = s.nextInt();
		
		if( kor < 0 || eng < 0 || math < 0 ) {
			System.out.println("�߸��� ���� �Է�");
			System.exit(0);
		}		
		int tot = kor + eng + math;
		double avg = (double)tot / 3;
		String grade;  //���� ���ڿ� ����
		
		if( avg <= 100 && avg >= 90) grade = "A����";			
		else if( avg >= 80 && avg <= 89) grade = "B����";			
		else if( avg >= 70 && avg <= 79) grade = "C����";			
		else if( avg >= 60 && avg <= 69) grade = "D����";			
		else grade = "F����";		 
			
		System.out.println("����:" + tot + " ���:" + avg + " ����:" + grade);
	}

}
