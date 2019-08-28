package java_exercise50;
/**
 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * @author Administrator
 *
 */
public class Exercise04 {
	public static void main(String[] args) {
		int num = 90;
		int prime = 2;
		System.out.print(num+"=");
		while(num>=prime){
			if(num == prime){
				System.out.print(prime);
				break;
			}else if(num%prime == 0){
				System.out.print(prime + "*");
				num /= prime;
			}else{
				prime ++;
			}
		}
	}
}
