package Day09;

public class BookTest {

	public static void main(String[] args) {
		
		Book bk = new Book();
		
		bk.title = "객체지향 기초";
		bk.author = "제임스 고슬링";
		bk.price = 30000;
		bk.pubData = "2013년 7월08일";
		bk.maxPage = 300;
		
		System.out.println( bk.title );
		System.out.println( bk.author );
		System.out.println( bk.maxPage );
		System.out.println( bk.pubData );
		System.out.println( bk.price );
	}

}
