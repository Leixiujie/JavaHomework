
public class Worker extends Person {
	private double salary;
	private String level;
	
	public Worker(String name,int age,double salary,String level){
		super(name,age);
		this.salary=salary;
		this.level=level;
	}
	
	public void display() {
		super.display();
		System.out.println("工资是"+salary);
		System.out.println("等级是"+level);
	}
}
