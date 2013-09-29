package Day03;
import java.util.Scanner;
public class Z11_Ifelseifgrade {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				
		System.out.print("총점 입력: ");
		int score = s.nextInt();
		
		if( score <= 100 && score >= 90)
			System.out.println("A학점!");
		else if( score >= 80 && score <= 89)
			System.out.println("B학점!");
		else if( score >= 70 && score <= 79)
			System.out.println("C학점!");
		else if( score >= 60 && score <= 69)
			System.out.println("D학점!");
		else 
			System.out.println("F학점!");		
		
	}

}
