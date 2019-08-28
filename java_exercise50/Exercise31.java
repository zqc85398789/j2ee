package java_exercise50;

import java.util.Arrays;

/**
 * 将一个数组逆序输出
 * @author Administrator
 *
 */
public class Exercise31 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println("生成随机数组：");
		System.out.println(Arrays.toString(arr));
		
		/*
		//对数组进行了反转并输出，改变了数组的内容
		int temp;
		for(int i=0;i<arr.length/2;i++){
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));*/
		
		System.out.print("逆序输出的结果是：\n[");
		for(int i=arr.length-1;i>0;i--){
			System.out.print(arr[i]+" ,");
		}
		System.out.println(arr[0]+"]");
	}
}
