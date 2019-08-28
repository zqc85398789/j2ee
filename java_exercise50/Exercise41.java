package java_exercise50;
/**
 * 编程创建一个Point类，在其中定义两个变量表示一个点的坐标值，再定义构造函数初始化为坐标原点。
 * 然后定义一个方法实现点的移动，再定义一个方法打印当前点的坐标。并创建一个对象验证。
 * @author Administrator
 *
 */
public class Exercise41 {
	public static void main(String[] args) {
		Point p = new Point();
		p.move(12, 6);
		p.move(-6, 4);
		p.showCoordinate();
	}
}

/**
 * 只考虑整点坐标
 * @author Administrator
 *
 */
class Point{
	private int abscissa;
	private int ordinate;
	
	public Point(){
		abscissa = 0;
		ordinate = 0;
	}
	
	public void move(int x,int y){
		abscissa += x;
		ordinate += y;
	}
	
	public void showCoordinate(){
		System.out.println("["+abscissa+","+ordinate+"]");
	}
}
