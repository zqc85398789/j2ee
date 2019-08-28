package java_exercise50;


/**
 * 创建一个3*4及一个4*2的矩阵，求它们相乘的结果
 * @author Administrator
 *
 */
public class Exercise42 {
	public static void main(String[] args) {
		int[][] matrix1 = new int[3][4];
		int[][] matrix2 = new int[4][2];
		//初始化
		initMatrix(matrix1);
		initMatrix(matrix2);
		
		//打印
		displayMatrix(matrix1);
		System.out.println("\t×");
		displayMatrix(matrix2);
		System.out.println("\t=");
		
		//矩阵相乘
		int[][] result = multMatrix(matrix1, matrix2);
		displayMatrix(result);
		
		//测试运算正确性
		int[][] arr1 = {{1,2,3},{4,5,6}};
		int[][] arr2 = {{6},{6},{6}};
		displayMatrix(multMatrix(arr1, arr2));
	}
	
	public static int[][] multMatrix(int[][] matrix1,int[][] matrix2){
		if(matrix1[0].length != matrix2.length){
			System.out.println("矩阵1的列数与矩阵2的行数不相等，不能相乘");
			return null;
		}else{
			int temp;
			int[][] result = new int[matrix1.length][matrix2[0].length];
			for(int i=0;i<result.length;i++){
				for(int j=0;j<result[i].length;j++){
					temp = 0;
					for(int k=0;k<matrix2.length;k++){
						temp += matrix1[i][k]*matrix2[k][j];
					}
					result[i][j] = temp;
				}
			}
			return result;
		}
	}
	
	
	/**
	 * 初始化二维数组
	 * @param matrix
	 */
	public static void initMatrix(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				matrix[i][j] = (int)(Math.random()*100);
			}
		}
	}
	
	/**
	 * 打印二维数组
	 * @param matrix
	 */
	public static void displayMatrix(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
