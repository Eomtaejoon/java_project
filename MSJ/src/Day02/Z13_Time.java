package Day02;
import java.util.Scanner;
public class Z13_Time {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int  input, hour, min, sec;

		System.out.print("계산하고자 하는 초를 입력하세요 : ");
		input = s.nextInt();

		hour = input / 3600;
		input = input % 3600;

		min = input / 60;
		sec = input % 60;

		System.out.println(hour + "시간" + min + "분" + sec + "초입니다.");

	}

}
