import java.util.*;
public class StudentInfo1{
    public static void main(String args[]){
	int SIZE=5;
	double grade[]=new double[SIZE];
	double averageGrade=0;
	Scanner sc = new Scanner(System.in);

	for(int i=0;i<SIZE;i++){
	    grade[i]=sc.nextDouble();}
	for(int i=0;i<SIZE;i++){
	    averageGrade=averageGrade+grade[i];}
	averageGrade=averageGrade/SIZE;
	System.out.println("ƽ���ɼ���"+averageGrade);
	for(int i=0;i<SIZE;i++){
	   System.out.println("ѧ���ɼ���"+grade[i]);}
	}
}