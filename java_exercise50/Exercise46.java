package java_exercise50;

import java_exercise50.util.ArrayUtil;

/**
 * 拼接两个数组 
 * @author Administrator
 *
 */
public class Exercise46 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = {8,9,10,11,12};
		
		int[] arr3 = new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr3.length;i++){
			if(i<arr1.length){
				arr3[i] = arr1[i];
			}else{
				arr3[i] = arr2[i-arr1.length];
			}
		}
		
		ArrayUtil.display(arr3);
	}
}
