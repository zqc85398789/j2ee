package java_exercise50;

import java.util.Scanner;

/**
 * 请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。
 * @author Administrator
 *
 */
public class Exercise26 {
	public static void main(String[] args) {
		char letter = '?';
		System.out.println("请输入第一个字母：");
		while(letter == '?'){
			letter = getLetter();
		}
		
		switch(letter){
		case 'm':
			System.out.println("星期一：Monday");
			break;
		case 'w':
			System.out.println("星期三：Wednesday");
			break;
		case 'f':
			System.out.println("星期五：Friday");
			break;
		case 't':
			{
				letter = '?';
				System.out.println("请输入第二个字符：");
				while(letter == '?'){
					letter = getLetter();
				}
				if(letter == 'u'){
					System.out.println("星期二：Tuesday");
				}else if(letter == 'h'){
					System.out.println("星期四：Thursday");
				}else{
					System.out.println("拼写错误");
				}
			};
			break;
		case 's':
			{
				letter = '?';
				System.out.println("请输入第二个字符：");
				while(letter == '?'){
					letter = getLetter();
				}
				if(letter == 'a'){
					System.out.println("星期六：Saturday");
				}else if(letter == 'u'){
					System.out.println("星期日：Sunday");
				}else{
					System.out.println("拼写错误");
				}
			};
			break;
			default:
				System.out.println("拼写错误");
		}
	}
	
	/**
	 * 获取输入的内容，判断是否为英文字符，若符合条件，返回其小写形式
	 * @return
	 */
	public static char getLetter(){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(input.length()!=1){
			System.out.println("请输入单个字符：");
			return '?';
		}
		char letter = input.charAt(0);
		if(letter>='a'&&letter<='z'){
			return letter;
		}else if(letter>='A'&&letter<='Z'){
			//转换为小写字母
			return (char)(letter+32);
		}
		System.out.println("请输入英文字母：");
		return '?';
	}
}
