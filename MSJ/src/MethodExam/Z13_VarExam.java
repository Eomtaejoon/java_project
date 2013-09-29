package MethodExam;

public class Z13_VarExam {

	static int NUM = 10; //전역 변수
	
	
	static void ptr(int x) {
		NUM = NUM + x;
		System.out.println("ptr: " + NUM);		
	}	
	static void str() {
		System.out.println("str: " + NUM);
		
	}	
	public static void main(String[] args) {
		
		ptr(10);
		str();

	}

}
