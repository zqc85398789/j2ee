package java_exercise50.util;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {
	private static Random rd = new Random();
	/**
	 * 返回随机数组
	 * @param length 数组大小
	 * @param max 数组元素值上限
	 * @param min 数组元素值下限
	 * @param isorderly 是否有序
	 * @return
	 * @throws Exception 
	 */
	public static int[] getArray(int length,int max,int min,boolean isOrderly) throws Exception{
		int[] arr = new int[length];
		if(max<min){
			throw new Exception("最大值不得小于最小值！");
		}
		for(int i=0;i<length;i++){
			arr[i] = rd.nextInt(max-min+1)+min;
		}
		if(isOrderly){
			Arrays.sort(arr);
		}
		return arr;
	}
	
	/**
	 * 无格式打印，按序输出int数组内的元素，以空格隔开
	 * @param arr
	 */
	public static void display(int[] arr){
		for(int i:arr){
			System.out.print(i+"  ");
		}
		System.out.println();
	}
}
