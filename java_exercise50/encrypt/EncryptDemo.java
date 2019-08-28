package java_exercise50.encrypt;
/**
 * 文字加密算法，将字母转换为数字数组，从数组第2位起，依次对前一位做异或运算
 * 数组最后一位异或运算完成后，第一位对最后一位做异或运算，完成加密
 * 以上操作重复n次，即加密n轮
 * 
 * 解密时，将数组第一位对最后一位进行异或运算，接着从最后一位开始，依次对前一位做异或运算，到数组第二位完成运算为止
 * 以上操作重复n次，即完成n轮解密
 */
import java.util.Arrays;

public class EncryptDemo {
	public static void main(String[] args) {
		String str = "Tomorrow is another day";
		int[] arr = encrypt(turnToNum(str), 3);
		System.out.println(Arrays.toString(arr));
		str = decode(arr, 3);
		System.out.println(str);
	}
	
	//加密
	public static int[] encrypt(int[] numArr,int times){
		for(int i=0;i<times;i++){
			for(int j=1;j<numArr.length;j++){
				numArr[j] = numArr[j]^numArr[j-1];
			}
			numArr[0] = numArr[0]^numArr[numArr.length-1];
		}
		return numArr;
	}
	
	//解密
	public static String decode(int[] numArr,int times){
		char[] strArr = new char[numArr.length];
		for(int i=0;i<times;i++){
			numArr[0] = numArr[0]^numArr[numArr.length-1];
			for(int j=numArr.length-1;j>0;j--){
				numArr[j] = numArr[j]^numArr[j-1];
			}
		}
		for(int i=0;i<numArr.length;i++){
			strArr[i] = (char)numArr[i];
		}
		return new String(strArr);
	}
	
	public static int[] turnToNum(String str){
		char[] strArr = str.toCharArray();
		int[] numArr = new int[strArr.length];
		for(int i=0;i<strArr.length;i++){
			numArr[i] = (int)strArr[i];
		}
		return numArr;
	}
}

