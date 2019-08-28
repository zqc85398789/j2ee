package d01_create_variates.entity;

/**
*学生类
*/
public class HighSchoolStudent{
	/**
	*学生类属性
	*权限为public，方便测试
	*/
	public String name;			//姓名
	public String id;			//学号
	public String sex;			//性别
	public int age;				//年龄
	public String subject;		//学科

	/*
	*构造方法（无参）
	*/
	public HighSchoolStudent(){
		super();
	}
	/*
	*构造方法（带参）
	*/
	public HighSchoolStudent(String name,String id,String sex,int age,String subject){
		this.name = name;
		this.id = id;
		this.sex = sex;
		this.age = age;
		this.subject = subject;
	}
	
	/*
	*学习方法
	*/
	public void study(){
		System.out.println("Student learing...");
	}

	public String toString(){
		return "name:"+this.name+"  id:"+this.id+"  age:"+this.age+"  sex:"+this.sex+"  subject:"+this.subject;
	}
}


