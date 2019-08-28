package java_exercise50;

import java.util.Scanner;

/**
 * 输入某年某月某日，判断这一天是这一年的第几天？  
 * @author Administrator
 *
 */
public class Exercise14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		System.out.println("请输入日期：");
		int date = sc.nextInt();
		
		int dateNum = getDateNum(year,month,date);
		if(dateNum == -1){
			System.out.println("输入的月份或日期有误。");
		}else{
			System.out.println(year+"年的"+month+"月"+date+"日是这一年的第"+dateNum+"天。");
		}
	}

	private static int getDateNum(int year, int month, int date) {
		int[] monthDate = {31,28,31,30,31,30,31,31,30,31,30,31};
		int dateNum = 0;
		//如果是闰年，将二月的天数改为29
		if(isLeapYear(year)){
			monthDate[1] = 29;
		}
		//判断月份和日期是否在有效范围内
		if((month>0&&month<13)&&(date>0&&date<=monthDate[month-1])){
			for(int i=0;i<month-1;i++){
				dateNum += monthDate[i];
			}
			dateNum += date;
			return dateNum;
		}
		return -1;
	}

	private static boolean isLeapYear(int year) {
		if(year%400 == 0){
			return true;
		}
		if(year%4 == 0 && year%100 != 0){
			return true;
		}
		return false;
	}
}
