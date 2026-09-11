import PersonalPackages.*;
import java.util.*;
class stud{
	public static void main(String cp[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter your roll no. : ");
		int roll = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter your Class : ");
		String classname = sc.nextLine();
		
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		
		
		studentDetails s = new studentDetails();
		s.show(name,roll,classname,age);
	} 
}