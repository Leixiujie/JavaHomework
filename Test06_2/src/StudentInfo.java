import java.util.Scanner;
public class StudentInfo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name="����";
        int age=23;
        double grade=input();
        String result=judge(grade);
        
        System.out.println("����"+name);
        System.out.println("����"+age);
        System.out.println("�ɼ�"+grade);
        System.out.println("���Խ��"+result);        
	}
	public static String judge(double grade){
		String result="ͨ��";
		if(grade<60){
			result="��ͨ��";
		}
		return result;
	}
	
    public static double input(){
    	Scanner sc=new Scanner(System.in);
    	return sc.nextDouble();
    }
}