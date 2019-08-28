package d01_create_variates.exercise;
/**
 * 变量的声明和赋值
 * */
import d01_create_variates.entity.HighSchoolStudent;

public class CreatObjectDemo {
	public static void main(String[] args) {
		char c = '\'';
		System.out.println(c);
		c = 'a';
		System.out.println((int)++c);
		
		float f1 = 1;
		float f2 = 1.0f;
		float f3 = 0.1235f;	
		//System.out.printf("%.3f\n",f1);  //??为何退位
		System.out.println(f1+"  "+f2+"  "+f3);
		
		double d1 = 1d;
		double d2 = 1.0;
		double d3 = 0.1;
		System.out.println(d1+"  "+d2+"  "+d3);
		
		f1 = (float)1.5E+3;
		d1 = 1.5E+3;
		System.out.println(d1);
		
		double d = 9.0;
		float f = (float)d;
		System.out.println(f);
		
		System.out.println("0123456".substring(0,5));	//不包含后一位索引
		
		HighSchoolStudent student = new HighSchoolStudent("honoka","0001","femail",16,"science");
		System.out.println(student.toString());
	}
}
