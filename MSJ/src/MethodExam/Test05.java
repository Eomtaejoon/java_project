package MethodExam;

import java.util.Scanner;
public class Test05 {	
	static Scanner scan = new Scanner(System.in);
	static int[] ary = new int[4];
	static int i=0;
	static int a;	
	
	static void RR() {
		int temp;
		
		temp = ary[0];//초기값은 		
		for(int i=0; i<ary.length-1;i++)		
			ary[i] = ary[i+1];
		
		ary[ary.length-1] = temp;		
		
		for(int i=0;i<4;i++) {
			System.out.printf("%3d,",ary[i]);
		}	
	}	
	public static void main(String[] args) {		
		for(i=0;i<4;i++) {			
			System.out.printf("%d번째 배열값입력: ",i+1);			
			ary[i] = scan.nextInt();			
		}
		i=0;
		while(true) {
			System.out.printf("돌리시겠습니까?(1/2)");						
			a = scan.nextInt();				
			if( a == 1 ) {
				System.out.printf("%d번째 실행 결과 \n",i+1);
				RR();
				System.out.printf("\n");
				
			}else {
				System.out.printf("종료합니다\n");
				break;
			}
			i=i+1;
		}
	}

}
