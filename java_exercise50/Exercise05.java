package java_exercise50;
/**
 * 利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，
 * 60-89分之间的用B表示，60分以下的用C表示。
 * @author Administrator
 *
 */
public class Exercise05 {
	public static void main(String[] args) {
		String grade;
		int score = (int)(Math.random()*100);
		System.out.println("分数为"+score);
		grade = score>=90?"A":score>=60?"B":"C";
		System.out.println("评级为"+grade);
	}
}
