package MethodExam;
import java.util.Scanner;
public class Z07_Method08 {

	static double triArea(double w, double h) {		
		double area;
		area = (w * h) / 2.0;
		
		return area;		
	}	
	static double inDoubleValue() {
		Scanner scan = new Scanner(System.in);
		System.out.print("°ª : ");
		double value = scan.nextDouble();
		
		return value;
	}	
	public static void main(String[] args) {		
		
		double d1 = inDoubleValue();
		double d2 = inDoubleValue();
		
		double result = triArea(d1, d2);
		
		System.out.println(result);	
			

	}

}



