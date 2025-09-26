// Parent class (Superclass)
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class (Subclass) inheriting from Animal
class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name); // Call the parent class constructor
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

    // Method overriding: providing a specific implementation for the eat() method
    @Override
    public void eat() {
        System.out.println(name + " the " + breed + " is happily eating dog food.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the subclass (Dog)
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        // Access methods inherited from the parent class (Animal)
        myDog.sleep(); // Inherited method
        myDog.eat();   // Overridden method in Dog class

        // Access method specific to the child class (Dog)
        myDog.bark();

        // Demonstrate polymorphism (upcasting)
        Animal anotherAnimal = new Dog("Max", "Labrador");
        anotherAnimal.eat(); // Calls the overridden eat() method in Dog
        anotherAnimal.sleep(); // Calls the inherited sleep() method from Animal
        // anotherAnimal.bark(); // This would cause a compile-time error as bark() is not in Animal
    }
}
