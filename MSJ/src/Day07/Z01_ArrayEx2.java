package Day07;
public class Z01_ArrayEx2 {
	/**
	 * �迭 �����ϴ� ���
	 */
	public static void main(String[] args) {
		String[] ary = {"1��","2��","3��"};// 0,1,2
		String[] sqr = new String[ary.length + 1];//0,1,2,3

//(�����迭,���縦 ������ ���� �����ġ(����), ������ �迭 , ���縦 ���� �� ��ġ, �����迭.length);
		System.arraycopy(ary, 0, sqr, 0, ary.length);
		sqr[3] = "4��";
		
		System.out.print("sqr[]: ");
		for(int i=0; i<sqr.length; i++)
			System.out.print(sqr[i]);
		
		System.out.println();
		System.out.println("=================");
		ary = sqr; //�迭 ����		
		
		System.out.print("ary[]: ");
		for(int i = 0; i < ary.length ; i++){
			System.out.print(ary[i]);
		}

	}

}









