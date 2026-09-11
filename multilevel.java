class A{
	public void showA(){
		System.out.println("In A");
	}
}

class B extends A {
	public void showB(){
	 System.out.println("In B");
	 showA();
	 System.out.println("Accessed class A from B");
	}
}

class C extends B{
	public void showC(){
	showB();
	 System.out.println("In C");
	 System.out.println("Accessed class B from C");
	}
}

class main{
	public static void main(String cp[]){
		C obj = new C();
		obj.showC();
	}
}