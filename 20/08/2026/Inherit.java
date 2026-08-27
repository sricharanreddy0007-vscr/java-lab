class Super {
    void show() {
        System.out.println("I'm in Super class");
    }
}

class Sub extends Super {
    void display() {
        System.out.println("I'm in CSM A");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Sub obj1 = new Sub();
        obj1.show();      
        obj1.display();  
    }
}