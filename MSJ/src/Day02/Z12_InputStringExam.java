package Day02;
import java.util.Scanner;
public class Z12_InputStringExam {
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);		
		int number;
		String s1,s2;
		
		System.out.print("s1 문자열: ");
		s1 = input.nextLine();
		
		System.out.print("number 정수: ");
		number = input.nextInt();		
		
		System.out.print("s2 문자열: ");
		s2 = input.nextLine();
		
		System.out.println(s1 + " " + number + " " + s2);

	}
}
