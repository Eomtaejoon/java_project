package Day09;

public class Box {	
	int width;
	int height;
	int length;
	
	void boxVolume(int w, int h, int l){
		width = w;
		height = h;
		length = l;				
		System.out.println(w * h * l);		
	}	
}
