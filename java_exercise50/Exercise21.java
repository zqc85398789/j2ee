package java_exercise50;
/**
 * 求1+2!+3!+...+20!的和，不使用递归方法
 * @author Administrator
 *
 */
public class Exercise21 {
	public static void main(String[] args) {
		long sum = 0; 
	    long factorial = 1;
	    for(int i=1; i<=20; i++) {
	     factorial *= i;
	     sum += factorial;
	    }
	    System.out.println(sum);
	}
}
