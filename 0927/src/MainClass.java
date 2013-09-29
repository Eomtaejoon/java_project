public class MainClass {
	
	public static void main(String[] args){
		GirlStudent st[] = new GirlStudent[5];
		int rank[] = new int[5];
		
		st[0] = new GirlStudent("마사키 게일라드", 82, 83, 88);
		st[1] = new GirlStudent("아마기리 유네", 89, 88, 92);
		st[2] = new GirlStudent("시라가 아이리", 80, 82, 84);
		st[3] = new GirlStudent("셜리 워릭", 90, 92, 94);
		st[4] = new GirlStudent("히노미야 코노카", 80, 86, 82);
		
		
		for(int i=0; i<st.length; i++){
			for(int j=0; j<st.length; j++){
				if(st[i].average < st[j].average)
					st[i].rank=st[i].rank + 1;
			}
			System.out.println("성명 : "+st[i].name+" / 세계사 : " +st[i].history+" / 사회 :" +st[i].society+" / 영어 :"+st[i].english+" / 총점 :"+st[i].sum+" / 평균 :"+st[i].average+" / 석차 : " +st[i].rank);
		}
	}
	
}