package d01_create_variates.exercise;

import d01_create_variates.entity.Computer;

public class ComputerApp {
	public static void main(String[] args) {
/*		
		*//**
		 * 利用类名调用静态方法
		 *//*
		Computer.compute();
		
		*//**
		 * 利用带参构造方法创建对象
		 *//*
		Computer c = new Computer("ALIENWARE","51M",true);
		
		System.out.println(c.toString());
		
		c.setModel("M15");
		
		System.out.println(c.toString());
		
		*//**
		 * 利用对象调用静态方法
		 *//*
		c.compute();*/
		
		Computer c = new Computer(2);
		System.out.println("已使用了"+c.getUsedYears()+"年");
		
	}
}
