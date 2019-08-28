package java_exercise50.hano_tower;

public class TestHano {
	public static void main(String[] args) {
		HanoGame hd = new HanoGame();
		int plies = 16;
		hd.hanoPlay(plies, "1号柱","2号柱","3号柱");
		System.out.println(hd.getCount());
	}
}