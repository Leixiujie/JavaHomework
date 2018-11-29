
public class MobilePhone extends Phone {
	private String brand;
	private String ownerId;
	
	public MobilePhone(String name,String code,String brand,String ownerId){
		super(name,code);
		this.brand=brand;
		this.ownerId=ownerId;
	}
	
	public double pay(int time,double price){
		return time*price;
	}
}
