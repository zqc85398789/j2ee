package java_exercise50.hano_tower;

public class HanoGame {
	private long count = 0;
	
	public long getCount(){
		return count;
	}
	
	public void hanoPlay(int plies,String str1,String str2,String str3){
		if(plies == 1){
			System.out.println(str1+"→"+str3);
			this.count ++;
		}else{
			hanoPlay(plies-1, str1, str3, str2);
			System.out.println(str1+"→"+str3);
			this.count ++;
			hanoPlay(plies-1, str2, str1, str3);
		}
	}
}