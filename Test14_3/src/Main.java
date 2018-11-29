
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone a = new MobilePhone("张三","13885552185","huawei","51136551156651132");
		a.display();
		System.out.println("价格是"+a.pay(10, 10.2));
	}

}
