//  Constructor Overloading
// class cons {
//     protected double pi = 3.14;

//     // String name;
//     // Area of Rectangle
//     cons(int l, int b) {
//         int res = l * b;
//         System.out.println("Area of Rectangle is : " + res);
//     }

//     // Area of Circle
//     cons(double r) {
//         double res = pi * r * r;
//         System.out.println("Area of Rectangle is : " + res);
//     }

//     cons(int num) {
//         if (num > 0) {
//             System.out.println("Entered number is positive number :  " + num);
//         } else {
//             System.out.println("Entered number is negative number :  " + num);
//         }
//     }

//     cons() {
//         System.out.println("Table of 2 using Default Constructor ");
//         for (int i = 1; i <= 20; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         new cons(3, 4);
//         new cons(5);
//         new cons(5.6);
//         new cons();

//     }
// }

// =========== COPY CONSTRUCTOR ========== //
class cons{
    String name;
    cons(String fname){
        name = fname;
    }
    cons(cons c){
        name = c.name + " Sankpal";
    }
    public void display(){
        System.out.println(name);
    }

    public static void main(String cp[]){
        cons c1 = new cons("Rudresh");
        cons c2 = new cons(c1);
        c1.display();
        c2.display();
    }
}