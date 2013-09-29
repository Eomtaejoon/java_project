package Day06;
import java.util.Scanner;
public class Z14_Array12 {
	public static void main(String[] args) {		
		int total = 0;
		int size;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하시오:");
		size = scan.nextInt();
		
		int[] scores = new int[size];
		
		for (int i = 0; i < scores.length; i++) {						
			System.out.print("성적을 입력하시오:");
			scores[i] = scan.nextInt();
		}
		
		for (int value: scores)
			total += value;
		
		System.out.println("평균 성적은" + total / scores.length + "입니다");

	}

}
