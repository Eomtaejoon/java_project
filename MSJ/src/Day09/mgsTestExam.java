package Day09;

public class mgsTestExam {
	public static void main(String[] args) {
		
		//mgsTest라는 객체 생성( 객체 인스턴스 )
		mgsTest mt = new mgsTest();
		
		mt.setName();
		mt.setSpeed(120);
		
		String name = mt.getName();
		int speed = mt.getSpeed();
		
		System.out.println(name);
		System.out.println(speed);

	}

}
