package Day05;
import java.util.Scanner;
public class Z02_LetterGame {
	public static void main(String[] args) {
		int answer =59;	// ����
		int guess;
		int tries = 0;
		Scanner scan = new Scanner(System.in);
		
		do { 
		    System.out.print("������ �����Ͽ� ���ÿ�: ");
		    guess = scan.nextInt();
		    tries++;
		
		    if (guess >answer)	// ����ڰ� �Է��� ������ ���亸�� ������
		    	System.out.println("-> ������ ������ �����ϴ�.");
		    
		    if (guess <answer)	// ����ڰ� �Է��� ������ ���亸�� ������ 
		    	System.out.println("-> ������ ������ �����ϴ�.");
		    
		    System.out.println();
		    
		    
		    
		}while (guess !=answer);
		System.out.println("�����մϴ�. �õ� Ƚ�� = " + tries);
	}
}






