package Day04;
import java.util.Scanner;
public class TestWhile {

	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
			
		int sum = 0;
		int n;
		
		System.out.println("���� �Է�(�������� 0�� �Է�): ");
		while( true ){				
			n = s.nextInt();
			
			if( n == 0 )
				break;
			
			sum = sum + n;		
			
		}		
		System.out.println("���� ���: " + sum);
	}

}
