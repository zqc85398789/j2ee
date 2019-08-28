package java_exercise50;

import java.util.Arrays;

import java_exercise50.util.ArrayUtil;


public class Exercise49 {
	public static void main(String[] args) throws Exception {
		int[] arr = ArrayUtil.getArray(10, 100, 10, false);
		System.out.println("升序测试：");
		System.out.println(Arrays.toString(arr));
		sort(arr, true);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("降序测试：");
		int[] arr1 = ArrayUtil.getArray(10, 100, 10, false);
		System.out.println(Arrays.toString(arr1));
		sort(arr1, false);
		System.out.println(Arrays.toString(arr1));
		
	}
	
	public static void sort(int[] arr,boolean isAscend){
		if(isAscend){
			for(int i=0;i<arr.length-1;i++){
				for(int j=0;j<arr.length-i-1;j++){
					if(arr[j]>arr[j+1]){
						arr[j] = arr[j]+arr[j+1];
						arr[j+1] = arr[j] - arr[j+1];
						arr[j] = arr[j] - arr[j+1];
					}
				}
			}
		}else{
			for(int i=0;i<arr.length-1;i++){
				for(int j=0;j<arr.length-i-1;j++){
					if(arr[j]<arr[j+1]){
						arr[j] = arr[j]+arr[j+1];
						arr[j+1] = arr[j] - arr[j+1];
						arr[j] = arr[j] - arr[j+1];
					}
				}
			}
		}
	}
}
