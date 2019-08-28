package java_exercise50;
/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 * @author Administrator
 *
 */
public class Exercise10 {
	public static void main(String[] args) {
		double height=100;
		int times = 10;
		double sumDistance = height;
		for(int i=1;i<times;i++){
			sumDistance += height;
			height /= 2;
		}
		System.out.println(sumDistance);
		//第10次反弹在第10次落地后
		System.out.println(height/2);
	}
}
