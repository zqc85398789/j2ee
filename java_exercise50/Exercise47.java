package java_exercise50;
/**
 * 有一个无限容积的杯子，第一次加入1克酒精和2克水，第二次加入3克酒精和4克水，
 * 第三次加入5克酒精和6克水，这样操作1000次后，酒精的浓度是多少？
 * @author Administrator
 *
 */
public class Exercise47 {
	public static void main(String[] args) {
		double alcohol = 0;
		double water = 0;
		for(int i=1;i<=1000;i++){
			alcohol += i*2-1;
			water += i*2;
		}
		double potency = alcohol/(alcohol+water);
		System.out.println(potency);
	}
}
