
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
		System.out.println("������"+name);
		System.out.println("������"+age);
		System.out.println("�ȼ���"+level);
		System.out.println("������"+salary);
	}
}
