package MethodExam;
import java.util.Scanner;
public class Z16_ExamMethodCalc {	
	static Scanner scan = new Scanner(System.in);
	
	static void title() {
		System.out.println();
		System.out.println("�ʰ����� ���ڸ��� ����");
		System.out.println("1. ���� ");
		System.out.println("2. ���� ");
		System.out.println("3. ���� ");
		System.out.println("4. ������ ");
		System.out.println("5. ���� ");
		System.out.print("-> �޴� ����: ");
	}	
	static void add(int x, int y) {
		System.out.println("���:" + x + "+" + y + "=" + (x+y));
	}
	static void sub(int x, int y) {
		System.out.println("���:" + x + "-" + y + "=" + (x-y));
	}
	static void mul(int x, int y) {
		System.out.println("���:" + x + "*" + y + "=" + (x*y));
	}
	static void div(int x, int y) {
		System.out.println("���:" + x + "/" + y + "=" + x/y);
	}	
	static int inputNumber() {	
		System.out.printf("���� �Է�: ");
		return scan.nextInt();		
	}	
	public static void main(String[] args) {		
		
		do{		
			title();		
			int choice = scan.nextInt();		
			int num1, num2; 
			
			switch(choice) {
				case 1:
					System.out.print("1�� ");
					num1 = inputNumber();
					System.out.print("2�� ");
					num2 = inputNumber();				
					add(num1, num2);				
					break;
				case 2:
					System.out.print("1�� ");
					num1 = inputNumber();
					System.out.print("2�� ");
					num2 = inputNumber();					
					sub(num1, num2);
					break;
				case 3:
					System.out.print("1�� ");
					num1 = inputNumber();
					System.out.print("2�� ");
					num2 = inputNumber();					
					mul(num1, num2);
					break;
				case 4:
					System.out.print("1�� ");
					num1 = inputNumber();
					System.out.print("2�� ");
					num2 = inputNumber();					
					div(num1, num2);
					break;
				case 5:
					System.out.println("���α׷� ����!!");
					System.exit(0);
				default: 
					System.out.println("�޴��� �߸� �Է���!!");
					break;				
			}
		}while(true);
	}
}
























