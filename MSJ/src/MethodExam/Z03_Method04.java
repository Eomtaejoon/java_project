package MethodExam;
public class Z03_Method04 {
	/** 메소드(Method) 2형식: 반환값(return)없음, 파라메터(parameter)없음 */
	
	static void numSQR(int x) {		
		int res;
		res = x * x;
		
		System.out.println(res);
	}	
	public static void main(String[] args) {
		
		int input = 100;
		
		numSQR(input);
	}

}
