package Day09;
public class Book {
	/** ��ü�� ���¸� ����...���� */
	String title;  //����.
	int price; // ����.
	String pubData; //������.
	String author; //����.
	int maxPage; //������ ��.	
	
	public static void main(String[] arg) {
		Book bk = new Book();
		
		bk.title = "��ü���� ����";
		bk.author = "���ӽ� ����";
		bk.price = 30000;
		bk.pubData = "2013�� 7��08��";
		bk.maxPage = 300;
		
		System.out.println( bk.title );
		System.out.println( bk.author );
		System.out.println( bk.maxPage );
		System.out.println( bk.pubData );
		System.out.println( bk.price );
	}	
}
