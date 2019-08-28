package java_exercise50;

import java.util.Random;


/**
 * 分别生成100、1000、10000个1~100间的随机数，统计个位数所占的比例
 * @author Administrator
 * 
 */
public class Exercise18 {
	public static void main(String[] args) {
		System.out.println(singular(100));
		System.out.println(singular(1000));
		System.out.println(singular(10000));
	}
	
	public static double singular(int quantity){
		Random rd = new Random();
		int count = 0;
		for(int i=0;i<quantity;i++){
			if(rd.nextInt(100)+1<10){
				count ++;
			}
		}
		return (double)count/quantity;
	}
}
