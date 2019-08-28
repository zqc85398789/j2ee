package java_exercise50;
/**
 * 题目：打印出杨辉三角形（要求打印出10行如下图）      
 *1   
 *1    1   
 *1    2    1   
 *1    3    3    1   
 *1    4    6    4    1   
 *1    5    10    10    5    1   
 *…………
 * @author Administrator
 *
 */
public class Exercise33 {
	public static void main(String[] args) {
		//c(m-1,n-1) = (n-1)!/[(m-1)!(n-m)!]
		//打印行数，由于数组为int类型，只能准确打印到第34行，第35行数据会溢出
		int line = 10;
		int[][] yangTriangle = new int[line][];
		//初始化二维数组的第1、2行
		yangTriangle[0] = new int[]{1};
		yangTriangle[1] = new int[]{1,1};
		
		for(int i=2;i<line;i++){
			//每一行的长度与行数（i+1）相等
			yangTriangle[i] = new int[i+1];
			//每一行的首末位都是1
			yangTriangle[i][0] = 1;
			yangTriangle[i][i] = 1;
			//除每一行的首尾外，每一个数的值为它上方和左上方两个数之和
			for(int j=1;j<i;j++){
				yangTriangle[i][j] = yangTriangle[i-1][j-1] + yangTriangle[i-1][j];
			}
		}
		
		display(yangTriangle);
	}
	/**
	 * 打印二维数组
	 * @param arr
	 */
	public static void display(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
