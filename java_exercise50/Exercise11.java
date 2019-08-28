
package java_exercise50;
/**
 * 有1、2、3、4四个数字，能组成多少个互不相同且一个数字中无重复数字的三位数？并把他们都输入。
 * @author Administrator
 *
 */
public class Exercise11 {
	public static void main(String[] args) {
		int count = 0;
		for(int i=1;i<5;i++){
			for(int j=1;j<5;j++){
				for(int k=1;k<5;k++){
					if(i!=j && j!=k && i!=k){
						System.out.println(i*100+j*10+k);
						count ++;
					}
				}
			}
		}
		System.out.println("共有"+count+"个数");
	}
}
