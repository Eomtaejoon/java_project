package Day03;
import java.util.Scanner;
public class Z07_Ifelse07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			
		System.out.print("점수를 입력하세요: ");
		int n = s.nextInt();
		
		if( (n%2)==0 && (n%3)==0 && (n%9)==0 )
			System.out.println("짝수 이면서 3의 배수 9의 배수임");
		else
			System.out.println("아님");

		
	}

}
