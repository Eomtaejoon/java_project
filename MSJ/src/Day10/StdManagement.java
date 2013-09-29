package Day10;
import java.util.Scanner;

public class StdManagement {	
	
	
	public int scoreInput(Student std[], Scanner scan) {
		int cnt = 0; //입력된 학생 수 초기값
		
		//첫번째 성적 입력 이후 다시 재 입력했을 경우. 
		for(int i=0; i<std.length; i++) {
			if(std[i].name != null) //입력되기 전까지 cnt1증가	
				cnt++;			    //배열은 객체 생성후 문자열 값이 null임
		}
		
		if( cnt == 0)  dataIn(std,scan,0); //처음 입력일때 호출  
		else  dataIn(std,scan,cnt);  //재 입력일때 호출 
				
		return 1; //성적 출력 메뉴 선택시 최초입력여부 판단 
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void dataIn(Student std[], Scanner scan, int cnt) {		
		
		for(int i=cnt; i<std.length; i++) {				
			if( i == 49 ) System.out.println("마지막 학생 입력입니다. ");
			
			System.out.println("==" + (i+1) + "번 학생 점수 입력 ==");
			System.out.print("학번(종료 0입력): ");
						
			//학번을 0입력하면 입력 종료..
			if( (std[i].sid = scan.nextInt()) == 0 ) break;
			
			scan.nextLine();			
			System.out.print("이름 : ");
			std[i].name = scan.nextLine();						
			System.out.print("국어 : ");
			std[i].kor = scan.nextInt();
			System.out.print("영어 : ");
			std[i].eng = scan.nextInt();
			System.out.print("수학 : ");
			std[i].math = scan.nextInt();
						
			std[i].tot = std[i].kor + std[i].eng + std[i].math;
			std[i].avg = std[i].tot / 3;			
			std[i].grade = gradeProc(std[i].avg);//학점 구하는 메소드 호출			
			std[i].rank = 1;	
			rank(std); //석차 구하는 메소드 호출			
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
	
	
	
	
	
	
	
	
	
	
	
	
	public void rank(Student std[]) { //석차 구하는 메소드
		
		
		for(int i = 0; i < std.length; i++) {
			std[i].rank  =  1; //처음에는 무조건 성적 입력후 rank에 1값 저장

			
			for(int j = 0; j < std.length; j++) {
				if(std[i].tot  <  std[j].tot) //비교해서 클때마다 rank 증가
					std[i].rank++;
			}
		}
	} 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void scoreOutput(Student std[], Scanner scan) {		
		System.out.println("============================= 성 적 출 력 ================================");
		System.out.println("학번\t이름\t국어\t영어 \t수학\t총점\t평균\t학점\t석차");	
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
		System.out.print("\n 검색 할 학번을 입력하시오: ");
		int scrSid = scan.nextInt();
		for(int i=0; i<std.length; i++) {
			if( std[i].sid == scrSid ) {
				System.out.println("\n ======================================================");
				System.out.print("학번: " + std[i].sid + "\t이름: " + 
				std[i].name + "\t총점: " + std[i].tot + "\t평균: " + 
						std[i].avg + "\t학점 : " + std[i].grade);
				System.out.println("\n ======================================================");
			}
		}
	}	
}






