package MethodExam;
public class Z04_Method05 {
	/** �޼ҵ�(Method) 3����: ��ȯ��(return)����, �Ķ����(parameter)���� */
	
	static double getNumber() {		
		System.out.println("������ �Ǵ� �޼ҵ� �Դϴ�.1!!");		
		return 3.14;		
	}	
	public static void main(String[] args) {	
		
		//System.out.println( getNumber() );
		
		double pi;
		
		pi = getNumber();
		
		System.out.println(5*5*pi);

	}

}
