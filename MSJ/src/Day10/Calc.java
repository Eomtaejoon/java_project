package Day10;
public class Calc {	
	//�ν��Ͻ� ���� ����
	public int num1;
	public int num2;
	
	public void setNum(int n1, int n2) { //�ν��Ͻ� ������ ���� �����ϴ� �޼ҵ� 
		num1 = n1;
		num2 = n2;
	}	
	//Calc Ŭ������ �޼ҵ�(�ൿ +, - , *, /)
	public int addC() { return num1 + num2; }
	public int subC() { return num1 - num2; }
	public int mulC() {	return num1 * num2; }
	public int divC() {
		if( num2 == 0 ) {
			System.out.println("0���� ������ �����ϴ�. ");
			return 0;
		}else {
			return num1 / num2;
		}
	}	
}
