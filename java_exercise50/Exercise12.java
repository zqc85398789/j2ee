package java_exercise50;

import java.util.Scanner;

/**
 * 企业发放的奖金根据利润提成。
 * 利润低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%；
 * 40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%；
 * 高于100万元时，超过100万元的部分按1%提成。
 * 从键盘输入当月利润，求应发放奖金总数？
 * @author Administrator
 *
 */
public class Exercise12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入利润（万元）：");
		System.out.println(getSalary(sc.nextDouble()));
	}
	
	public static double getSalary(double profit){
		double salary = 0;
		if(profit<=10){
			salary = 0.1*profit;
		}else if(profit <= 20){
			salary = getSalary(10) + 0.075*(profit-10);
		}else if(profit <= 40){
			salary = getSalary(20) + 0.05*(profit-20);
		}else if(profit <= 60){
			salary = getSalary(40) + 0.03*(profit-40);
		}else if(profit <= 100){
			salary = getSalary(60) + 0.015*(profit-60);
		}else{
			salary = getSalary(100) + 0.01*(profit-100);
		}
		return salary;
	}
}
