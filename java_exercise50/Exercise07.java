package java_exercise50;

import java.util.Scanner;

/**
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * @author Administrator
 *
 */
public class Exercise07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int letterCount = 0;
		int digitCount = 0;
		int spaceCount = 0;
		int othersCount = 0;
		System.out.println("Please input...");
		String input = sc.nextLine();
		char[] arr = input.toCharArray();
		for(char c:arr){
			if(Character.isLetter(c)){
				letterCount ++;
			}else if(Character.isDigit(c)){
				digitCount ++;
			}else if(Character.isSpaceChar(c)){
				spaceCount ++;
			}else{
				othersCount ++;
			}
		}
		System.out.println(letterCount+" "+digitCount+" "+spaceCount+" "+othersCount);
	}
}
