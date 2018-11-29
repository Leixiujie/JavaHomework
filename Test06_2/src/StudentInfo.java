import java.util.Scanner;
public class StudentInfo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name="张三";
        int age=23;
        double grade=input();
        String result=judge(grade);
        
        System.out.println("姓名"+name);
        System.out.println("年龄"+age);
        System.out.println("成绩"+grade);
        System.out.println("考试结果"+result);        
	}
	public static String judge(double grade){
		String result="通过";
		if(grade<60){
			result="不通过";
		}
		return result;
	}
	
    public static double input(){
    	Scanner sc=new Scanner(System.in);
    	return sc.nextDouble();
    }
}