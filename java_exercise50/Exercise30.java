package java_exercise50;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 * @author Administrator
 *
 */
public class Exercise30 {
	public static void main(String[] args) {
		int[] upArr = getArray(true,10);
		System.out.println("生成递增数列");
		System.out.println(Arrays.toString(upArr));
		
		int[] downArr = getArray(false, 12);
		System.out.println("生成递减数列");
		System.out.println(Arrays.toString(downArr));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输入要加入数组的数字：");
		//这里省略验证过程
		int insertNum = sc.nextInt();
		
		//调用插入方法
		upArr = insert(insertNum, upArr);
		downArr = insert(insertNum, downArr);
		
		//打印结果
		System.out.println("加入新数据后的递增数列：");
		System.out.println(Arrays.toString(upArr));
		System.out.println("加入新数据后的递减数列：");
		System.out.println(Arrays.toString(downArr));
	}
	
	private static int[] insert(int num,int[] arr){
		if(arr.length<2){
			System.out.println("数组长度小于2，不存在排序规律");
			return arr;
		}else if(arr[0] == arr[arr.length-1]){
			//极端情况，随机生成的有序数组，所有元素一致。此时直接返回原数组，免除扩容操作。
			System.out.println("数组所有元素大小一致，不存在排序规律");
			return arr;
		}
		//数组扩容
		arr = arrayExpansion(arr);
		if(arr[0]<arr[arr.length-2]){
			//插入升序数组
			for(int i=arr.length-1;i>0;i--){
				if(num<arr[i-1]){
					arr[i] = arr[i-1];
					if(i==1){
						arr[0] = num;
						break;
					}
				}else{
					arr[i] = num;
					break;
				}
			}
		}else{
			//插入降序数组
			for(int i=arr.length-1;i>0;i--){
				if(num>arr[i-1]){
					arr[i] = arr[i-1];
					if(i==1){
						arr[0] = num;
						break;
					}
				}else{
					arr[i] = num;
					break;
				}
			}
		}
		return arr;
	}

	/**
	 * 数组扩容，长度+1，以便插入新元素
	 * @param arr
	 * @return
	 */
	private static int[] arrayExpansion(int[] arr) {
		//新建数组，长度为原数组+1，将原数组的元素存放到新数组的0~length-2位
		int[] newArr = new int[arr.length+1];
		for(int i=0;i<arr.length;i++){
			newArr[i] = arr[i];
		}
		return newArr;
	}
	
	/**
	 * 视参数情况生成有序数列，ture为升序，false为降序
	 * @param isUp
	 * @param length
	 * @return
	 */
	private static int[] getArray(boolean isUp,int length) {
		int count = 0;
		int[] arr = new int[length];
		if(isUp){
			for(int i=0;i<arr.length;i++){
				arr[i] = count + (int)(Math.random()*10);
				count = arr[i];
			}
		}else{
			for(int i=arr.length-1;i>=0;i--){
				arr[i] = count + (int)(Math.random()*10);
				count = arr[i];
			}
		}
		return arr;
	}
}
