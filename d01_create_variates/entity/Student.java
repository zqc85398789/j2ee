package d01_create_variates.entity;

public class Student {
	
	private String name;
	
	/**
	 * 性别，'m'||'f'
	 * */
	private char sex;
	
	private String id;
	
	private int age;
	
	private double height;
	
	private double weight;
	
	/**
	 * 学科
	 */
	private String subject;	
	
	/**
	 * 入学考试成绩
	 */
	private byte entrance_Score; 

	/**
	 * 是否全日制
	 */
	private boolean isFullTime;	

	/**
	 * 学费
	 */
	private short oneYear_Fee;
}
