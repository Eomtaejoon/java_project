package Day10;
public class CarTest {	
	public static void main(String[] arg) {		
		Car c1 = new Car(); //°´Ã¼ »ý¼º(instance)
		Car c2 = new Car(); 
		
		System.out.println("c1-color: " + c1.color);
		System.out.println("c2-color: " + c2.color);
		c1.color = "blue";
		System.out.println("c1-color: " + c1.color);
		System.out.println("c2-color: " + c2.color);
		
		c2 = c1;
		
		System.out.println("c1-color: " + c1.color);
		System.out.println("c2-color: " + c2.color);
	
		c1 = null;
		

		c1.color = "red";
		
		
	}

}
