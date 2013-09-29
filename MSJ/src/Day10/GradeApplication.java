package Day10;
import java.util.Scanner;
public class GradeApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		StdManagement smg = new StdManagement();
		
		Student std[] = new Student[50]; //student ��ü �迭 ����
		
		int flag = 0;
		
		for(int i=0; i<std.length; i++) 
			std[i] = new Student(); //��ü �迭�� ��ü �Ҵ�
		
		do {
			System.out.println();
			System.out.println("���� ���� ���α׷�");
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ���");
			System.out.println("3. �˻� ");			
			System.out.println("4. ����");
			System.out.print("�޴� ����: ");
			
			int choice = scan.nextInt();
			switch( choice ) {
				case 1: 
					flag = smg.scoreInput(std, scan);
					break;
				case 2: 
					if( flag == 1 ) {
						smg.scoreOutput(std, scan);
						break;
					}
					else if( flag == 0 ) {
						System.out.println("\n== �Էµ� ������ �����ϴ�.==");
						break;
					}				
				case 3:
					if( flag == 1 ) {
						smg.searchSrc(std, scan);
						break;
					}
					else if( flag == 0 ) {
						System.out.println("\n== �˻��� ������ �����ϴ�.==");
						break;
					}						
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("~~�޴��� �ٽ� �������ֽñ� �ٶ��ϴ�.~~");
					break;
			}
		}while(true);		

	}

}

