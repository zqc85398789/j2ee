package java_exercise50;
/**
 * 求100之内的素数
 * @author Administrator
 *
 */
public class Exercise27 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			if(i==2||i==3){
				System.out.print(i+" ");
				continue;
			}
			for(int j=2;j*j<=i;j++){
				if(i%j == 0){
					break;
				}
				if((j+1)*(j+1)>i){
					System.out.print(i+" ");
				}
			}
		}
	}
}
