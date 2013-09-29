
public class GirlStudent extends Secret{
	
		public String name = null;
		public int history;
		public int society;
		public int english;
		
		public int sum;
		public double average;
		public int rank=1;
		
		public GirlStudent(String name, int history, int society, int english) {
			this.name = name;
			this.history = history;
			this.society = society;
			this.english = english;
			process();
		}
		
		public void process(){
			sum = totalPlus(history, society, english);
			average = average(history, society, english);		
		}

}


// 이유 : process에서 설정한 내부 변수에서만 처리됨.
// 너가 원한건 secret안의 public 오 선언한 sum average 인데 ㅇㅅㅇ.. 