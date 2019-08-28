package java_exercise50;

import java.util.Scanner;

/**
 * 写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
 * @author Administrator
 *
 */
public class Exercise38 {
	public static void main(String[] args) {
		//不明白题目的考察点是什么，如果只是String.length()，似乎过于简单
		//其余方式也是转换类型后查看属性，多此一举
		Scanner sc = new Scanner(System.in);
		System.out.println("输入字符串：");
		String input = sc.nextLine();
		System.out.println("输入的长度为"+input.length());
		
		//=====================不用String.length()======================
		char[] inputs = input.toCharArray();
		System.out.println("输入的长度为"+inputs.length);
	}
}
