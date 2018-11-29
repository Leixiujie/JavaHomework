public class Test2{
    public static void main(String args[]){ 
	double grade=70;
	if(grade<60){
	   display("未通过考试",grade);
	   }
	else{
	   display("通过考试",grade);
	   }
	}
    public static void display(String result,double grade){
	System.out.println(result);
	System.out.println("成绩为："+grade);
	}
}