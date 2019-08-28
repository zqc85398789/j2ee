package java_exercise50;
/**
 * 生成一个随机数的3*3矩阵，并求出对角线元素之和
 * @author Administrator
 *
 */
public class Exercise29 {
	public static void main(String[] args) {
		//生成矩阵second order matrix
		int[][] som = new int[3][3];
		for(int i=0;i<som.length;i++){
			for(int j=0;j<som[i].length;j++){
				som[i][j] = (int)(Math.random()*100);
			}
		}
		
		//打印矩阵
		for(int i=0;i<som.length;i++){
			for(int j=0;j<som[i].length;j++){
				System.out.print(som[i][j]+"\t");
			}
			System.out.println();
		}
		
		//求对角线元素的和
		int sum=0;
		for(int i=0;i<som.length;i++){
			sum += som[i][i];
		}
		System.out.println("对角线之和为："+sum);
	}
}
