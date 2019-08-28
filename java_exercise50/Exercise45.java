package java_exercise50;
/**
 * 创建一个5*5的二维数组，要求逐行打印的结果是'*'组成的“王”字。
 * @author Administrator
 *
 */
public class Exercise45 {
	public static void main(String[] args) {
		char[][] cArr = new char[5][5];
		for(int i=0;i<cArr.length;i++){
			if(i%2==0){
				for(int j=0;j<cArr[i].length;j++){
					cArr[i][j] = '*';
				}
			}else{
				for(int j=0;j<cArr[i].length;j++){
					if(j==2){
						cArr[i][j] = '*';
						continue;
					}
					cArr[i][j] = ' ';
				}
			}
		}
		
		//打印
		display(cArr);
	}
	
	public static void display(char[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
