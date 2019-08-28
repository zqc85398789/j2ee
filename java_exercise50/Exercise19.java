package java_exercise50;
/**
 * 
题目：根据行数，打印出菱形排布的“*”，如行数为7，打印如下图形（只考虑行数为奇数） 
   *   
  ***   
 *****   
*******   
 *****   
  ***   
   *   
 * @author Administrator
 *
 */
public class Exercise19 {
	public static void main(String[] args) {
		//算法对任意奇数行有效
		int line = 11;
		printRhombus(line);
	}
	
	public static void printRhombus(int line){
		//打印上半部分
		for(int i=1;i<=line/2;i++){
			for(int j=1;j<=(line-1)/2+i;j++){
				if(j<= line/2+1-i){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		//打印中间行
		
		for(int i=1;i<=line;i++){
			System.out.print("*");
		}
		System.out.println();
		
		//打印下半部分
		for(int i=line/2+2;i<=line;i++){
			for(int j=1;j<=line*3/2+1-i;j++){
				//当两行相加=line+1时，打印的内容是相同的
				if(j<= i-1-line/2){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
