package Day10;
public class WrapperExam {
    int num1; //������� ����
    String num2; //������� ����

    public void go( ) {  // ���α׷��� �����ϱ� ���� �޼ҵ�
        num1 = 20;
        num2 = "30";

        System.out.println(num1 + num2);
        int num3 = Integer.parseInt(num2); // ���� Ŭ������ �̿��� ���ڿ����� int�� ��ȯ 
	 System.out.println(num1 + num3);
    }

	public static void main(String[] args) {
		WrapperExam we = new WrapperExam();
        we.go();
	}

}
