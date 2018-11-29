public class StudentInfo{
public static void main (String args[]){
   String name="张三";
   int age = 23;
   double grade = 87.67;
   String result = "通过";

   if(grade<60){
	result="不通过";}

   System.out.println("姓名"+name);
   System.out.println("年龄"+age);
   System.out.println("成绩"+grade);
   System.out.println("考试结果"+result);
   }
}