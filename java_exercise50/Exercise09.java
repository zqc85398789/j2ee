package java_exercise50;
/**
 * 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3。
 * 找出1000以内的所有完数。
 * @author Administrator
 *
 */
public class Exercise09 {
	public static void main(String[] args) {
		for(int i=1;i<=1000;i++){
			int sum = 0;
			int current = i;
			int j=1;
			while(j<=current/2){
				if(current%j == 0){
					sum += j;
				}
				j++;
			}
			if(sum == current){
				System.out.println(current);
			}
		}
	}
}
