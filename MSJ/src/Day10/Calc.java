package Day10;
public class Calc {	
	//인스턴스 변수 선언
	public int num1;
	public int num2;
	
	public void setNum(int n1, int n2) { //인스턴스 변수에 값을 설정하는 메소드 
		num1 = n1;
		num2 = n2;
	}	
	//Calc 클래스의 메소드(행동 +, - , *, /)
	public int addC() { return num1 + num2; }
	public int subC() { return num1 - num2; }
	public int mulC() {	return num1 * num2; }
	public int divC() {
		if( num2 == 0 ) {
			System.out.println("0으로 나눌수 없습니다. ");
			return 0;
		}else {
			return num1 / num2;
		}
	}	
}
