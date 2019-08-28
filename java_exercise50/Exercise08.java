package java_exercise50;
/**
 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 * @author Administrator
 *
 */
public class Exercise08 {
	public static void main(String[] args) {
		int basicNum = 2;
		int count = 10;
		long sum = 0;
		long tempNum = 0;
		for(int i=0;i<count;i++){
			tempNum = tempNum*10 + basicNum;
			System.out.print(tempNum);
			if(i != count-1){
				System.out.print(" + ");
			}else{
				System.out.print(" = ");
			}
			sum += tempNum;
		}
		System.out.println(sum);
	}
}
