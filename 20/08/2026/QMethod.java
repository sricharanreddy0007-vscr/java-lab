class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class QMethod {
    public static void main(String[] args) {
        Animal myPet1 = new Dog();   
        Animal myPet2 = new Animal();

        myPet1.sound(); 
        myPet2.sound(); 
    }
}