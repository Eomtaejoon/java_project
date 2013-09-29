package Day05;
import java.util.Random;
import java.util.Scanner;
public class Z00_GameGuGuDan {	
	public static void main(String[] args) {
		int x, y;
	    char op;
	    
	    while(true) {	    
		    Random r = new Random();		 
		    x = Math.abs(r.nextInt() % 9) + 1;
		    y = Math.abs(r.nextInt() % 9) + 1;
		    
		    int num = x * y;	
		    System.out.println();
		    System.out.println("* 구구단 "+ x + "단에 대한 문제입니다");
		    System.out.println();
	
		    System.out.print(x + " * " + y + " = ");

		    Scanner s = new Scanner(System.in);
		    int inputNum = s.nextInt();
		   
		    if(num == inputNum){
		      System.out.println("맞았습니다!");
		    }
		    else{
		      System.out.println("틀렸습니다. 정답은 " + num + "입니다.");
		    }	    
	    }

	}

}
