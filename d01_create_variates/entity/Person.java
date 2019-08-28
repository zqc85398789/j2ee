package d01_create_variates.entity;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;

	/**
	 * 无参的构造方法
	 */
	public Person() {
		super();
	}

	/**
	 * 带参的构造方法
	 * 
	 * @param name
	 * @param age
	 * @param height
	 * @param weight
	 */
	public Person(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	/**
	 * 返回值类型为空，输出一行语句
	 * 权限为public，外界均可调用
	 */
	public void work() {
		System.out.println("Word hard for money....");
	}

	/**
	 * 获取姓名
	 * 
	 * @return 返回人名，返回值类型为String
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 修改姓名 返回值为空
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
