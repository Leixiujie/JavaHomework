
public class Worker extends Person {
	private double salary;
	private String level;
	
	public Worker(String name,int age,double salary,String level){
		super(name,age);
		this.salary=salary;
		this.level=level;
	}
}
