import java.util.*;
class area{
	void show(double l , double b){
		double res = l * b;
		System.out.println("Area of rectangle is : " + res);
	}

 public static void main(String cp[]){
		Scanner sc = new Scanner(System.in);
		area a = new area();
		
		System.out.print("Enter length :");
		double len = sc.nextDouble();
		
		System.out.print("Enter breadth :");
		double br = sc.nextDouble();
		
		a.show(len , br);
	}
 }