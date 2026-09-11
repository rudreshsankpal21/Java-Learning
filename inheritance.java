interface intf1{
	void showIntf1();
}
interface intf2{
	void showIntf2();
}


// MULTIPLE , MULTILEVEL INHERITANCE
class A implements intf1 , intf2{
    public void table(int num){
		System.out.println("Table of :" + num);
		for(int i = 1; i < num * 11; i++){
			if(i % num == 0){
			System.out.println(i);
		}
	}
}
	public void evenodd(int num){
		if(num % 2 != 0){
			System.out.println("Odd number :" + num);
		} else {
			System.out.println("Even number :" + num);
		}
    }
	
	public void showIntf1(){
		System.out.println("Interface 1");	
	}
	public void showIntf2(){
		System.out.println("Interface 2");	
	}

}

class B extends A{
	int num = 8;
    public void display1(){
        table(num);
    }
}


// SIMPLE INHERITANCE
class C extends B{
    public void display2(){
		evenodd(num);
    }
}


// HIERARCHICAL INHERITANCE
class state{
	public void displaystate(){
	System.out.println("Maharashtra : ");
	}
}

class city1 extends state{
	void displaycity1(){
	System.out.println("Solapur");
	}
}

class city2 extends state{
	void displaycity2(){
	System.out.println("Pune");
	}
}



class main{
    public static void main(String cp[]){
		A intfObj = new A();
        C obj = new C();
		
		city1 c1 = new city1();
		city2 c2 = new city2();
		
       obj.display1();
	   obj.display2();
	   
	   intfObj.showIntf1();
	   intfObj.showIntf2();
	   
	  
	   c1.displaystate();
	    c1.displaycity1();
	  
	   c2.displaystate();
	    c2.displaycity2();
    }
}