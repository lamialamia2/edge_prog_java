// Parent class (Superclass)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating...");
    }

    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Child class (Subclass) inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking...");
    }
}

// Another subclass
class Cat extends Animal {
    void meow() {
        System.out.println(name + " is meowing...");
    }
}

// Main class to test inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Tommy";
        d.eat();     // Inherited method
        d.sleep();   // Inherited method
        d.bark();    // Dog's own method

        System.out.println();

        Cat c = new Cat();
        c.name = "Kitty";
        c.eat();     // Inherited method
        c.sleep();   // Inherited method
        c.meow();    // Cat's own method
    }
}

