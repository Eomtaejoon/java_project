package MethodExam;
import java.util.Scanner;
public class Z15_MethodFac {
	
	static long inFAC() {
		long fac;		
		Scanner scan = new Scanner(System.in);		
		System.out.println("팩토리얼 입력: ");
		fac = scan.nextLong();		
		return fac;
	}	
	static long proFAC(long fac) {
		int result = 1;		
		for(int i=1; i<=fac; i++) {			
			result = result * i;			
		}
		return result;
	}
	static void ptrFAC(long fac, long result) {
		System.out.println(fac + "! = " + result);
	}
	public static void main(String[] args) {			
		long fac = inFAC();
		long result = proFAC(fac);
		ptrFAC(fac, result);
	}
}
