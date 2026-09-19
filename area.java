import java.util.*;
class area{
	void show(double r){
		double res = 3.14 * r * r;
		System.out.println("Area of circle is : " + res);
	}

 public static void main(String cp[]){
		Scanner sc = new Scanner(System.in);
		area a = new area();
		
		System.out.print("Enter radius :");
		double r = sc.nextDouble();
		
		// System.out.print("Enter breadth :");
		// double br = sc.nextDouble();
		
		a.show(r);
	}
 }