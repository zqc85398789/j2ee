package java_exercise50;

import java.util.Random;

/**
 * 对10个数进行排序
 * @author Administrator
 *
 */
public class Exercise28 {
	public static void main(String[] args) {
		Random rd = new Random();
		//生成长度为10的int类型随机数数组
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = rd.nextInt(100);
		}
		
		System.out.println("排序前的数组：");
		for(int i:arr){
			System.out.print(i+" ");
		}
		
		System.out.println("\n排序后的数组");
		bubbleSort(arr);
		for(int i:arr){
			System.out.print(i+" ");
		}
		
	}
	
	/**
	 * 冒泡排序
	 * @param arr
	 */
	public static void bubbleSort(int[] arr){
		if(arr == null){
			System.out.println("数组对象为空。");
		}else{
			for(int i=0;i<arr.length-1;i++){
				for(int j=0;j<arr.length-1-i;j++){
					if(arr[j]>arr[j+1]){
						arr[j] = arr[j] + arr[j+1];
						arr[j+1] = arr[j] - arr[j+1];
						arr[j] = arr[j] - arr[j+1];
					}
				}
			}
		}
	}
}
