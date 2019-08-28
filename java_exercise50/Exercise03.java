package java_exercise50;
/**
 * 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 * @author Administrator
 *
 */
public class Exercise03 {
	public static void main(String[] args) {
		int hun = 0;
		int ten = 0;
		int sin = 0;
		for(int i=100;i<1000;i++){
			hun = i/100;
			ten = i/10%10;
			sin = i%10;
			if(hun*hun*hun+ten*ten*ten+sin*sin*sin == i){
				System.out.println(i);
			}
		}
	}
}
