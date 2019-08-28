package java_exercise50;
/**
 * 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，找出符合条件的数。
 * @author Administrator
 *
 */
public class Exercise13 {
	public static void main(String[] args) {
		//算法1，以基数作为循环
		for(int i=0;i*2<=167;i++){	//当(i+1)^2-i^2 > 168时，不可能找到符合条件的数
			double basic = i*i;
			if(Math.sqrt(basic+168)%1 ==0){
				System.out.print((int)(basic-100)+"\t");
			}
		}
		
		System.out.println("\n======================================");
		
		//算法2，以目标数作为循环
		int num = -100;
		while(Math.sqrt(num+268)-Math.sqrt(num+100)>=1){
			if(Math.sqrt(num+100)%1==0 && Math.sqrt(num+268)%1==0){
				System.out.print(num+"\t");
			}
			num ++;
		}
	}
}
