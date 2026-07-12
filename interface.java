// interface intf {
//     void show();
// }

// class demo implements intf{
//     public void show(){
//         System.out.println("From interface ");
//     }

//     public static void main(String[] args) {
//         demo d = new demo();
//         d.show();
//     }
// }



interface intf1{
    public void show();
}
interface intf2{
    public void display();
}


class demo implements intf1, intf2{
    public void show(){
        System.out.println("From interface 1");
    }
    public void display(){
        System.out.println("From interface 2");
    }
}


class main{
    public static void main(String[] args) {
        demo obj = new demo();
        obj.show();
        obj.display();
    }
}