package Day10;
import java.util.Scanner;

public class StdManagement {	
	
	
	public int scoreInput(Student std[], Scanner scan) {
		int cnt = 0; //�Էµ� �л� �� �ʱⰪ
		
		//ù��° ���� �Է� ���� �ٽ� �� �Է����� ���. 
		for(int i=0; i<std.length; i++) {
			if(std[i].name != null) //�ԷµǱ� ������ cnt1����	
				cnt++;			    //�迭�� ��ü ������ ���ڿ� ���� null��
		}
		
		if( cnt == 0)  dataIn(std,scan,0); //ó�� �Է��϶� ȣ��  
		else  dataIn(std,scan,cnt);  //�� �Է��϶� ȣ�� 
				
		return 1; //���� ��� �޴� ���ý� �����Է¿��� �Ǵ� 
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void dataIn(Student std[], Scanner scan, int cnt) {		
		
		for(int i=cnt; i<std.length; i++) {				
			if( i == 49 ) System.out.println("������ �л� �Է��Դϴ�. ");
			
			System.out.println("==" + (i+1) + "�� �л� ���� �Է� ==");
			System.out.print("�й�(���� 0�Է�): ");
						
			//�й��� 0�Է��ϸ� �Է� ����..
			if( (std[i].sid = scan.nextInt()) == 0 ) break;
			
			scan.nextLine();			
			System.out.print("�̸� : ");
			std[i].name = scan.nextLine();						
			System.out.print("���� : ");
			std[i].kor = scan.nextInt();
			System.out.print("���� : ");
			std[i].eng = scan.nextInt();
			System.out.print("���� : ");
			std[i].math = scan.nextInt();
						
			std[i].tot = std[i].kor + std[i].eng + std[i].math;
			std[i].avg = std[i].tot / 3;			
			std[i].grade = gradeProc(std[i].avg);//���� ���ϴ� �޼ҵ� ȣ��			
			std[i].rank = 1;	
			rank(std); //���� ���ϴ� �޼ҵ� ȣ��			
			System.out.println();			
		}		
	}		
	public String gradeProc(double avg) {
		if( avg >= 95) return "A+"; 
		else if( avg <= 94 && avg >= 90 ) return "A0";
		else if( avg <= 89 && avg >= 85 ) return "B+";
		else if( avg <= 84 && avg >= 80 ) return "B0";
		else if( avg <= 79 && avg >= 75 ) return "C+";
		else if( avg <= 74 && avg >= 70 ) return "C0";
		else if( avg <= 69 && avg >= 65 ) return "D+";
		else if( avg <= 64 && avg >= 60 ) return "D0";
		else return "F";
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	public void rank(Student std[]) { //���� ���ϴ� �޼ҵ�
		
		
		for(int i = 0; i < std.length; i++) {
			std[i].rank  =  1; //ó������ ������ ���� �Է��� rank�� 1�� ����

			
			for(int j = 0; j < std.length; j++) {
				if(std[i].tot  <  std[j].tot) //���ؼ� Ŭ������ rank ����
					std[i].rank++;
			}
		}
	} 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void scoreOutput(Student std[], Scanner scan) {		
		System.out.println("============================= �� �� �� �� ================================");
		System.out.println("�й�\t�̸�\t����\t���� \t����\t����\t���\t����\t����");	
		for(int i=0; i<std.length; i++) {			
			if( std[i].sid != 0) {			
				System.out.println(std[i].sid+"\t"+std[i].name+"\t"
			                    +std[i].kor+"\t"+std[i].eng+"\t"+
								std[i].math+"\t"+std[i].tot+"\t"+
			                    std[i].avg+"\t"+std[i].grade+"\t"+
								std[i].rank);
			}
		}
	}		
	public void searchSrc(Student std[], Scanner scan) {
		System.out.print("\n �˻� �� �й��� �Է��Ͻÿ�: ");
		int scrSid = scan.nextInt();
		for(int i=0; i<std.length; i++) {
			if( std[i].sid == scrSid ) {
				System.out.println("\n ======================================================");
				System.out.print("�й�: " + std[i].sid + "\t�̸�: " + 
				std[i].name + "\t����: " + std[i].tot + "\t���: " + 
						std[i].avg + "\t���� : " + std[i].grade);
				System.out.println("\n ======================================================");
			}
		}
	}	
}






