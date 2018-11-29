
public class MobilePhone extends Phone {
	private String brand;
	private String ownerId;
	
	public MobilePhone(String name,String code,String brand,String ownerId){
		super(name,code);
		this.brand=brand;
		this.ownerId=ownerId;
	}
	
	public void display() {
		System.out.println("手机号为:"+code);
		System.out.println("品牌是"+brand);
		System.out.println("所有者身份证号是"+ownerId);
	}
	
	public double pay(int time,double price){
		return time*price;
	}
}
