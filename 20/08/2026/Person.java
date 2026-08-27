public class Person {
        Person() {
        System.out.println("Introduction");
    }
    Person(String name) {
        System.out.println("Name: " + name);
    }

    Person(String schName, int rollNo) {
        System.out.println("School name: " + schName);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Person P1 = new Person();              
        Person P2 = new Person("Jaswith");     
        Person P3 = new Person("ABC", 12);     
    }
}