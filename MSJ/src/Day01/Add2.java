package Day01;
import java.util.Scanner;

public class Add2 {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x, y, sum;	
		
		System.out.print("ù��° ���ڸ� �Է�: ");
		x = input.nextInt();		
		System.out.print("�ι�° ���ڸ� �Է�: ");
		y = input.nextInt();
		
		sum = x + y;		
		System.out.println("��� : " + sum);		
	}
}
