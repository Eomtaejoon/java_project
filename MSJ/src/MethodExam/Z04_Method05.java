package MethodExam;
public class Z04_Method05 {
	/** 메소드(Method) 3형식: 반환값(return)있음, 파라메터(parameter)없음 */
	
	static double getNumber() {		
		System.out.println("리턴이 되는 메소드 입니다.1!!");		
		return 3.14;		
	}	
	public static void main(String[] args) {	
		
		//System.out.println( getNumber() );
		
		double pi;
		
		pi = getNumber();
		
		System.out.println(5*5*pi);

	}

}
