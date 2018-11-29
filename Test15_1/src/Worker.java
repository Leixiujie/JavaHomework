
public class Worker extends Person {
	private String professionalTitle;
	
	public Worker(String name,int age,String professionalTitle){
		super(name,age);
		this.professionalTitle=professionalTitle;
	}
	
	public void display(){
		System.out.println("Professionaltitle is "+professionalTitle);
	}
}
