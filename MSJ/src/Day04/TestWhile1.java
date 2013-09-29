package Day04;

import java.util.Scanner;
public class TestWhile1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int sum = 0, n;
		String inInt;
		
		System.out.println("정수값 입력");
		while( true ){				
			inInt = s.nextLine();
			
			if( inInt.equals("END") || inInt.equals("end") ) { 
				break;
			}
			else {			
				n = Integer.parseInt(inInt);
				sum = sum + n;
			}
		}		
		System.out.println("더한 결과: " + sum);
	}

}
