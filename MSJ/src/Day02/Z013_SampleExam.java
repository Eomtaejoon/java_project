package Day02;
import java.util.Scanner;
public class Z013_SampleExam {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double h, w, area;
		
		System.out.print("���� : ");
		w = scan.nextDouble();
		
		System.out.print("���� : ");
		h = scan.nextDouble();
				
		area = w * h;
		
		System.out.println("�簢���� ������ " + area);	
				
	}
}
