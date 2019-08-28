package java_exercise50;
/**
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？  
 * @author Administrator
 *
 */
public class Exercise01 {
	public static void main(String[] args) {
		int month = 8;
		System.out.println("第"+month+"个月的兔子数是"+countRubbits(month));
	}
	
	public static int countRubbits(int month){
		int sum = 1;
		int lastMonth = 1;
		if(month < 3){
			return 1;
		}else{
			for(int i=3;i<=month;i++){
				int temp = sum;
				sum += lastMonth;
				lastMonth = temp;
			}
			return sum;
		}
	}
}
