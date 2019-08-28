package java_exercise50;

import java_exercise50.util.ArrayUtil;

/**
 * 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 * @author Administrator
 *
 */
public class Exercise35 {
	public static void main(String[] args) throws Exception {
		//为了方便，写了ArrayUtil工具类，可以生成给定长度、最大最小值范围、有序或无序的int数组，提供打印方法
		int[] arr = ArrayUtil.getArray(10, 100, 0, false);
		System.out.println("操作前的数组");
		ArrayUtil.display(arr);
		
		int maxIndex = 0;
		int minIndex = 0;
		//初始值为arr[0]，故从arr[1]开始比较
		for(int i=1;i<arr.length;i++){
			if(arr[maxIndex] < arr[i]){
				maxIndex = i;
			}
			if(arr[minIndex] > arr[i]){
				minIndex = i;
			}
		}
		
		//交换最大值和第一位
		int temp = arr[0];
		arr[0] = arr[maxIndex];
		arr[maxIndex] = temp;
		
		//交换最小值和最后一位
		temp = arr[arr.length-1];
		arr[arr.length-1] = arr[minIndex];
		arr[minIndex] = temp;
		
		System.out.println("操作后的数组为：");
		ArrayUtil.display(arr);
	}
}
