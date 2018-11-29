
public abstract class Phone {
	String code,name;
	
	public Phone(String name,String code){
		this.name=name;
		this.code=code;
	}
	
	public abstract void display();
}
