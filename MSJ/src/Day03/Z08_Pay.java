package Day03;
import java.util.Scanner;

public class Z08_Pay {
	public static void main(String[] args) {

		final int RATE = 5000;
		int pay; // 임금
		int hours; // 시간
		Scanner input = new Scanner(System.in);

		System.out.print("시간을 입력하시오: "); // 입력 안내 출력
		hours = input.nextInt();

		if (hours > 8)
			pay = RATE * 8 + (int) (1.5 * RATE * (hours - 8));
		else
			pay = RATE * hours;
		
		System.out.println("임금은 " + pay + " 입니다.");


	}

}
