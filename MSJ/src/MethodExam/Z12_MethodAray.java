package MethodExam;

public class Z12_MethodAray {

	static void aryary(int[] num) {
		int cnt = 1;
		System.out.println("num2: " + num);
		for(int i=0; i<10; i++) {
			num[i] = cnt++;
			System.out.print(num[i] + " ");
		}
		System.out.println();				 				
	}	
	public static void main(String[] args) {		
		int[] num = new int[10];
		
		System.out.println("num1: " + num);
		aryary(num); //�迭 �޼ҵ� ÷��. 		
		
		System.out.println("====================");
		for(int i=0; i<10; i++)
			System.out.print(num[i] + " ");		
		
	}

}
