package Day09;
import java.util.Scanner;
public class MethodScoreRef {	
	static void title() {
		System.out.println();
		System.out.println("===================================================");
		System.out.println("                                     ��      ��     ǥ                   ");
		System.out.println("===================================================");
		System.out.println("NO\t����\t����\t����\t����\t���\t����");
	}	
	static void menutitle() {
		System.out.println();
		System.out.println("���� ���� ���α׷�");
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ��� ");
		System.out.println("3. ���� ");
		System.out.print("-> �޴� ����: ");
	}	
	static int inScore(double[][] score, Scanner s, int stu) {
		double tot = 0;
		System.out.println("�� �л� �Է¼�: " + stu);
		for(int i=0; i<stu; i++) {			
			System.out.print((i+1) + "��° �л��� ����,����,���� ���� �Է� [90 78 87]: ");
			for(int j=0; j<3; j++) {
				score[i][j] = s.nextDouble(); 
				tot = tot + score[i][j];
			}
			score[i][3] = tot;
			score[i][4] = tot / 3;
			tot = 0;			
		}
		return 1;
	}
	static void outScore(double [][] score, int stu) {
		title();
		for(int i = 0;i < stu;i++) 	{
			System.out.print((i+1) + "\t");			
			for(int j = 0;j < 4;j++) 	{				
				System.out.printf("%.0f\t", score[i][j]);				
			}			
			System.out.printf("%.1f\t", score[i][4]);			
			if(score[i][4] >= 90) System.out.println(" A");
			else if((score[i][4] < 90) && (score[i][4] >= 80)) System.out.println(" B");
			else if((score[i][4] < 80) && (score[i][4] >= 70)) System.out.println(" C");
			else if((score[i][4] < 70) && (score[i][4] >= 60)) System.out.println(" D");
			else System.out.println(" F");				
		}		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		int student = 3; //�л� ��
		int inFlag = 0; //���� �Է� ���� Ȯ�� ���� 0�̸� ���Է�, 1�̸� �Է�
		double score[][] = new double[student][5];		
		do{		
			menutitle();			
			int choice = s.nextInt();						
			switch(choice) {
				case 1:
					inFlag = inScore(score, s, student);
					break;
				case 2:
					if( inFlag != 1 ) {
						System.out.println("���� �Է��� �����ϴ�. !!");
						break;
					}else if( inFlag == 1){
						outScore(score, student);
						break;					
					}
				default: 
					System.out.println("�޴��� �߸� �Է���!!");
					break;		
			}
		}while(true);	
	}			

}








