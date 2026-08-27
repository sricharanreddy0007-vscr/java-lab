class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;      
        this.name = name;
    }

    Employee(int id) {
        this.id = id;
        this.name = "Not Provided";
    }

    void show() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("---------------------");
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "shyam");
        Employee e2 = new Employee(102, "Raghu");
        Employee e3 = new Employee(111);

        e1.show();
        e2.show();
        e3.show();
    }
}