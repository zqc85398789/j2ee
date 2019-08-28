package java_exercise50;
/**
 * 输入两个正整数m和n，求其最大公约数和最小公倍数。
 * @author Administrator
 *
 */
public class Exercise06 {
	public static void main(String[] args) {
		int a = 64;
		int b = 32;
		System.out.println("最大公约数为"+getMaxComm(a, b));
		System.out.println("最小公倍数为"+(a*b/getMaxComm(a, b)));
	}
	
	public static int getMaxComm(int a ,int b){
		int bigger = Math.max(a, b);
		int smaller = Math.min(a, b);
		while(bigger%smaller > 0){
			int temp = bigger%smaller;
			bigger = smaller;
			smaller = temp;
		}
		return smaller;
	}
}
