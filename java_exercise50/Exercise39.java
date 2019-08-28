package java_exercise50;
/**
 *编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n
 *当输入n为奇数时，调用函数1/1+1/3+...+1/n
 * @author Administrator
 *
 */
public class Exercise39 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 11;
		System.out.println(fractionSum(num1));
		System.out.println(fractionSum(num2));
	}
	
	public static double fractionSum(int num){
		int basic = num%2==0 ? 2 : 1;
		double result = 0;
		while(basic <= num){
			result += 1.0/basic;
			basic += 2;
		}
		return result;
	}
}
