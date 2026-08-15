abstract class demo {
    abstract void show(String name);

    void display() {
        System.out.println("Hello from display method");
    }
}

class absdemo extends demo {
    void show(String name) {
        System.out.println("Hello " + name + " from show method");
    }

    public static void main(String[] args) {
        absdemo obj = new absdemo();
        obj.display();
        obj.show("Rudresh");
    }
}
