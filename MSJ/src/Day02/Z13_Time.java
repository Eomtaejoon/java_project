package Day02;
import java.util.Scanner;
public class Z13_Time {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int  input, hour, min, sec;

		System.out.print("����ϰ��� �ϴ� �ʸ� �Է��ϼ��� : ");
		input = s.nextInt();

		hour = input / 3600;
		input = input % 3600;

		min = input / 60;
		sec = input % 60;

		System.out.println(hour + "�ð�" + min + "��" + sec + "���Դϴ�.");

	}

}
