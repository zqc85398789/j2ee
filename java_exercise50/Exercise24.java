package java_exercise50;

/**
 * 给一个不多于15位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 * (使用数学方法，不允许转换为String类型)
 * @author Administrator
 *
 */
public class Exercise24 {
	public static void main(String[] args) {
		long num = 1234567898765L;
		int count = 0;
		while(num > 0){
			System.out.print(num%10);
			num /= 10;
			count ++;
		}
		System.out.println();
		System.out.println("这个数有"+count+"位");
	}
}
