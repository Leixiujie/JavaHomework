import java.util.Scanner;
public class StudentInfo2{
    public static void main(String args[]){
	int SIZE=5;
	double grade[]=new double[SIZE];
	double averageGrade=0;
	double maxGrade=0;

	Scanner sc=new Scanner(System.in);
        for(int i=0;i<SIZE;i++){
	    grade[i]=sc.nextDouble();}
	maxGrade=grade[0];
	for(int i=0;i<SIZE;i++){
	    averageGrade=averageGrade+grade[i];
		if(maxGrade<grade[i]){
		     maxGrade=grade[i];}
		}
	averageGrade=averageGrade/SIZE;
	System.out.println("ƽ���ɼ���"+averageGrade);
	System.out.println("��߳ɼ���"+maxGrade);
	for(int i=0;i<SIZE;i++){
	    System.out.println("ѧ���ɼ���"+grade[i]);}
    }
}