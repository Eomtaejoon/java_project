
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


// ���� : process���� ������ ���� ���������� ó����.
// �ʰ� ���Ѱ� secret���� public �� ������ sum average �ε� ������.. 