package Day03;
import java.util.Scanner;
public class Z03_Ifexam03 {
	/** 입력된 점수가 100이상이여도 100점으로 처리하는 예제*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total;
		
		System.out.print("총점을 (0~100)입력하세요: ");
		total = s.nextInt();
		
		if( total > 100 ) 
			total = 100;
		
		if( total < 0 ) 
			total = 0;
		
		
		System.out.println("총점:" + total);
	}

}










