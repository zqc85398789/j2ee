package java_exercise50;
/**
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 * @author Administrator
 *
 */
public class Exercise20 {
	public static void main(String[] args) {
		double d1 = 1;
		double d2 = 2;
		double sum = 0;
		double temp;
		for(int i=0;i<20;i++){
			sum += d2/d1;
			temp = d1;
			d1 = d2;
			d2 += temp;
		}
		System.out.println(sum);
	}
}
