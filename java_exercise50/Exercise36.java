package java_exercise50;

import java_exercise50.util.ArrayUtil;

/**
 * 有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 * @author Administrator
 *
 */
public class Exercise36 {
	public static void main(String[] args) throws Exception {
		int n = 10;
		int m = 4;
		int[] nums = ArrayUtil.getArray(n, 100, 0, false);
		System.out.println("顺序变动前：");
		ArrayUtil.display(nums);
		
		int[] tempArr = new int[m];
		for(int i=0;i<m;i++){
			tempArr[i] = nums[n-m+i];
		}
		
		for(int i=n-1;i>=0;i--){
			if(i>=m){
				nums[i] = nums[i-m];
				continue;
			}
			nums[i] = tempArr[i];
		}
		
		System.out.println("将后"+m+"位数放至最前：");
		ArrayUtil.display(nums);
	}
}
