package java_exercise50;
/**
 * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个。
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 * 以后每天早上都吃了前一天剩下的一半零一个。
 * 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
 * @author Administrator
 *
 */
public class Exercise17 {
	public static void main(String[] args) {
		int sum = 1;
		for(int i=10;i>1;i--){
			sum = (sum+1)*2;
		}
		System.out.println(sum);
	}
}
