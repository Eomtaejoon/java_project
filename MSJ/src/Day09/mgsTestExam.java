package Day09;

public class mgsTestExam {
	public static void main(String[] args) {
		
		//mgsTest��� ��ü ����( ��ü �ν��Ͻ� )
		mgsTest mt = new mgsTest();
		
		mt.setName();
		mt.setSpeed(120);
		
		String name = mt.getName();
		int speed = mt.getSpeed();
		
		System.out.println(name);
		System.out.println(speed);

	}

}
