package MethodExam;
import java.util.Scanner;

public class Z06_Method07 {
	
	static double triArea(double w, double h) {		
		double area;
		area = (w * h) / 2.0;
		
		return area;		
	}	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("πÿ∫Ø : ");
		double d1 = scan.nextDouble();
		
		System.out.print("≥Ù¿Ã : ");
		double d2 = scan.nextDouble();
		
		
		double result = triArea(d1, d2);
		
		System.out.println(result);	
			

	}

}



