package d01_create_variates.entity;

public class Animal {
	private boolean isSuckler;
	private String kind;
	private int age;
	private double weight;
	
	public Animal(){
		
	}
	
	public Animal(boolean isSuckler){
		this.isSuckler = isSuckler;
		if(this.isSuckler){
			System.out.println("该动物是哺乳动物");
		}else{
			System.out.println("该动物不是哺乳动物");
		}
		//System.out.println("该动物"+(this.isSuckler?"是":"不是")+"哺乳动物");
	}
	
	public Animal(String kind){
		this.kind = kind;
		System.out.println("该动物是"+this.kind);
	}
	
	public Animal(int age,String kind){
		this.age = age;
		this.kind = kind;
		System.out.println("该动物是"+this.age+"岁的"+this.kind);
	}
	
	public static void main(String[] args) {
		/** 创建哺乳动物 */
		Animal animal1 ;
		animal1 = new Animal(false);
		/** 创建海洋动物 */
		Animal animal2 = new Animal("海洋动物");
		/** 创建10岁的陆生动物 */
		Animal animal3 = new Animal(10,"陆生动物");
	}
}
