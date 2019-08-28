package java_exercise50;
/**
 * 判断101-200之间有多少个素数，并输出所有素数。
 * @author Administrator
 *
 */
public class Exercise02 {
	public static void main(String[] args) {
		int count = 0;
		boolean flag = true;
		for(int i=101;i<=200;i++){
			flag = true;
			for(int j=2;j*j<=i;j++){
				if(i%j == 0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.print(i+"  ");
				count ++;
			}
		}
		System.out.println("\n101-200总共有"+count+"个质数");
	}
}
