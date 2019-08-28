package java_exercise50;
/**
 * 使用continue语句实现：将100～300之间的不能被3整除的数输出。
 * @author Administrator
 *
 */
public class Exercise43 {
	public static void main(String[] args) {
		int count = 0;
		for(int i=100;i<=300;i++){
			if(i%3==0){
				continue;
			}
			System.out.print(i+"\t");
			if(++count%10==0){
				System.out.println();
			}
		}
	}
}
