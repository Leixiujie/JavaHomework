
public class Worker {
	private String level,name;
	private int age;
	private double salary;
	
	public Worker(String name,String level,int age,double salary) {
		this.name=name;
		this.level=level;
		this.age=age;
		this.salary=salary;
	}
	
	public void display() {
		System.out.println("姓名是"+name);
		System.out.println("年龄是"+age);
		System.out.println("等级是"+level);
		System.out.println("工资是"+salary);
	}
}
