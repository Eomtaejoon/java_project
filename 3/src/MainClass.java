public class MainClass {
	
	public static void main(String[] args){
		GirlStudent st[] = new GirlStudent[5];
		int rank[] = new int[5];
		
		st[0] = new GirlStudent("����Ű ���϶��", 82, 83, 88);
		st[1] = new GirlStudent("�Ƹ��⸮ ����", 89, 88, 92);
		st[2] = new GirlStudent("�ö� ���̸�", 80, 82, 84);
		st[3] = new GirlStudent("�ȸ� ����", 90, 92, 94);
		st[4] = new GirlStudent("����̾� �ڳ�ī", 80, 86, 82);
		
		
		for(int i=0; i<st.length; i++){
			for(int j=0; j<st.length; j++){
				if(st[i].average < st[j].average)
					st[i].rank=st[i].rank + 1;
			}
			System.out.println("���� : "+st[i].name+" / ����� : " +st[i].history+" / ��ȸ :" +st[i].society+" / ���� :"+st[i].english+" / ���� :"+st[i].sum+" / ��� :"+st[i].average+" / ���� : " +st[i].rank);
		}
	}
	
}