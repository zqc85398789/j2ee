package d01_create_variates.exercise;

import d01_create_variates.entity.Animal;

public class CreateAnimal {
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
