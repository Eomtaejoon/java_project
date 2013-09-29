package Day10;

public class StringObject {
	public static void main(String[] args) {
		
		String str1 = new String("COREA");
		String str2;
		
		str2 = str1.toLowerCase();//대 -> 소
		System.out.println(str2);
		
		str1 = new String("corea");
		str2 = str1.toUpperCase();//소 -> 문
		System.out.println(str2);
		/*
		str2 = str1.substring(1, 3);
		System.out.println(str2);
		*/
		
		/*
		str2 = str1.replace('k', 'c');
		System.out.println(str2);
		*/
		/*
		str2 = str1.concat("def");
		System.out.println(str2);
		
		System.out.println(str1.isEmpty());
		*/
		
		//String str2 = new String("b");
		/*for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			System.out.println( c );
		}*/
		/*
		int x = str1.compareTo(str2);
		
		System.out.println(x);
		*/
	}

}
