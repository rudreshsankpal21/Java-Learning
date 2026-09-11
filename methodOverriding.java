class college{
 String department() {	
        return "Computer Science";
    }
}

class student extends college{
	String department(){
		college ob = new college();
		    String str=ob.department();
		System.out.println("Main Department : " + str);
		
		System.out.println("Sub Branch : BCS ");
		
         return "success";		
	}
	
}

class Main{
	public static void main(String cp[]){
		college obj = new student();
		obj.department();
	}
}