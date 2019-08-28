package java_exercise50;
/**
 * 输入三个整数x,y,z，请把这三个数由小到大输出（不使用排序算法）。
 * @author Administrator
 *
 */
public class Exercise15 {
	public static void main(String[] args) {
		int x = 23;
		int y = 78;
		int z = 54;
		
		int max = x>=y?(x>=z?x:z):(y>=z?y:z);
		int mid = x>=y?(x<=z?x:(y>=z?y:z)):(y<=z?y:(x>=z?x:z));
		int min = x<=y?(x<=z?x:z):(y<=z?y:z);
		
		System.out.println(min+","+mid+","+max);
	}
}
