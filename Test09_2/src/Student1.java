public class Student1{
    private String name;
    private int age;
    private double grade;

    public Student1(){
	this.name="";
	this.age=0;
	this.grade=0;
    }

    public Student1(String name,int age,double grade){
	this.name=name;
	this.age=age;
	this.grade=grade;
    }

    public void display(){
	System.out.println("ĞÕÃû:"+name);
    }
}