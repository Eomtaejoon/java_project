package Day02;
import java.util.Scanner;
public class Z013_SampleExam {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double h, w, area;
		
		System.out.print("가로 : ");
		w = scan.nextDouble();
		
		System.out.print("세로 : ");
		h = scan.nextDouble();
				
		area = w * h;
		
		System.out.println("사각형의 면적은 " + area);	
				
	}
}
