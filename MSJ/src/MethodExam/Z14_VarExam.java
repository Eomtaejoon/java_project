package MethodExam;

public class Z14_VarExam {

	static void ptr(int x) {		
		System.out.println("ptr : " + x);
	}
	static void str(int x) {
		x = x + 10;		
		System.out.println("str : " + x);		
	}
	public static void main(String[] args) {
		
		int x = 0;
		
		ptr(x);
		str(x);
		
		System.out.println("main: " + x);

	}

}
