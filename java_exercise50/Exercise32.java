package java_exercise50;
/**
 * 取一个整数a从右端开始的4～7位。
 * @author Administrator
 *
 */
public class Exercise32 {
	public static void main(String[] args) {
		//省略验证过程
		long a = 123456789;
		System.out.println(a);
		long temp = a/1000;
		for(int i=4;i<=7;i++){
			System.out.println("从右开始第"+i+"位是:"+(temp%10));
			temp /= 10;
		}
	}
}
