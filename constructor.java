//  Constructor Overloading

class cons{
    // String name;
    cons(String fname){
        System.out.println("Parameterized Constructor : " + fname);
    }

    cons(){
        System.out.print("Default Constructor");
    }

    public static void main(String[] args) {
         new cons("Rudresh");
         new cons();
        
    }
}


//  