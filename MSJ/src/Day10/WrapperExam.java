package Day10;
public class WrapperExam {
    int num1; //멤버변수 선언
    String num2; //멤버변수 선언

    public void go( ) {  // 프로그램을 진행하기 위한 메소드
        num1 = 20;
        num2 = "30";

        System.out.println(num1 + num2);
        int num3 = Integer.parseInt(num2); // 랩퍼 클래스를 이용해 문자열값을 int로 변환 
	 System.out.println(num1 + num3);
    }

	public static void main(String[] args) {
		WrapperExam we = new WrapperExam();
        we.go();
	}

}
