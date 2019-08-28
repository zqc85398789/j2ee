package java_exercise50;
/**
 * 利用递归方法求5!。 
 * @author Administrator
 *
 */
public class Exercise22 {
	public static void main(String[] args) {
		System.out.println(getFactorial(5));
	}
	
	public static long getFactorial(int num){
		if(num != 1){
			return num*getFactorial(num-1);
		}else{
			return 1;
		}
	}
}
