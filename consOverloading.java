import java.util.*;
class consOverloading{
	consOverloading(){
		System.out.println("Default Cosntructor Called first");
	}
	
	consOverloading(String name , int roll){
		System.out.println("Entered name is :" + name);
		System.out.println("Entered Roll No is :" + roll);
	}
}


class main{
	public static void main(String cp[]){
		Scanner sc = new Scanner(System.in);
		new consOverloading();
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		System.out.print("Enter your Roll no : ");
		int roll = sc.nextInt();
		new consOverloading(name,roll);
		
	}
}