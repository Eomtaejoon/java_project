package Day04;

import java.util.Scanner;
public class Z99_Exam01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String gender;
		int i, fCnt=0;
		
		for(i=1;i<=10;i++){
			System.out.print("Enter your gender(m/w) : ");
			gender = s.nextLine();			
			
			if(gender.equals(gender));
			else {
				fCnt+=1;
			}
		}
		System.out.println("female count : " + fCnt);
	}
}
