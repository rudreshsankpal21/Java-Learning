interface intf {
    void show();
}

class demo implements intf{
    public void show(){
        System.out.println("From interface ");
    }

    public static void main(String[] args) {
        demo d = new demo();
        d.show();
    }
}

