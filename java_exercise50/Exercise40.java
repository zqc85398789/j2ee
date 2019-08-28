package java_exercise50;

import java.math.BigDecimal;

/**
 * 编程创建一个Box类，在其中定义三个变量表示一个立方体的长、宽和高，
 * 再定义一个方法setDemo对这三个变量进行初始化，
 * 再定义一个方法求立方体的体积。
 * 测试这个类，求给定尺寸的立方体的体积。
 * @author Administrator
 *
 */
public class Exercise40 {
	public static void main(String[] args) {
		Box box = new Box();
		box.setDemo(2.3, 4.1, 6);
		System.out.println(box.getVolume());
	}
}

class Box{
	private double length;
	private double width;
	private double height;
	
	public Box(){}
	
	public void setDemo(double length,double width,double height){
		if(length>=0 && width>=0 && height>=0){
			this.length = length;
			this.width = width;
			this.height = height;
		}else{
			System.out.println("边长不能为负数...");
		}
	}
	
	public double getVolume(){
		//在创建BigDecimal对象时，若构造方法传入参数为double类型，依旧有可能丢失精度，故使用String类型
		BigDecimal len = new BigDecimal(this.length+"");
		BigDecimal wid = new BigDecimal(this.width+"");
		BigDecimal hei = new BigDecimal(this.height+"");
		
		return len.multiply(wid.multiply(hei)).doubleValue();
	}
}