package d01_create_variates.entity;

public class Computer {
	private String brand;
	private String model;
	private boolean isLaptop;
	private int usedYears;
	
	public Computer(){
		
	}
	
	public Computer(String brand,String model,boolean isLaptop){
		this.brand = brand;
		this.model = model;
		this.isLaptop = isLaptop;
	}
	
	public Computer(int usedYears){
		this.usedYears = usedYears;
	}
	
	public int getUsedYears() {
		return usedYears;
	}

	public void setUsedYears(int usedYears) {
		this.usedYears = usedYears;
	}

	public static void compute(){
		System.out.println("Computing...");
	}
	
	public void setModel(String model){
		this.model = model;
	}
	
	public String toString(){
		return "brand:"+this.brand+"  model:"+this.model+"  isLabtop:"
		+this.isLaptop+"usedYears:"+this.usedYears;
	}
}
