public class Teacher{
    private String name;
    private int age;
    private double salary;
    private String professionalTitle;

    public Teacher(String name,int age,double salary,String professionalTitle){
	this.name=name;
	this.age=age;
	this.salary=salary;
	this.professionalTitle=professionalTitle;
    }

    public void display(){
	System.out.println("ÐÕÃû:"+name);
	System.out.println("¹¤×Ê:"+salary);
    }
}