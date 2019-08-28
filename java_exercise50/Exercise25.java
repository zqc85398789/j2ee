package java_exercise50;
/**
 * 给出一个数字，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 * @author Administrator
 *
 */
public class Exercise25 {
	public static void main(String[] args) {
		long num = 1234567654321L;
		long reversal = 0;
		long temp = num;
		while(temp > 0){
			reversal = reversal*10 + temp%10;
			temp /= 10;
		}
		if(num == reversal){
			System.out.println(num+"是回文数");
		}else{
			System.out.println(num+"不是回文数");
		}
	}
}
