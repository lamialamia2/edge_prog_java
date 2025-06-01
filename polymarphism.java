class Animal {
    void sound() {
        System.out.println("Animal sound...");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a = new Cat(); // Upcasting
        a.sound();
    }
}
