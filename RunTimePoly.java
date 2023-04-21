package Wiley_pkg_1;
class Animals {
    public void makeSound() {
        System.out.println("Animal");
    }
}

class Dog extends Animals {
    public void makeSound() {
        System.out.println("bark");
    }
}

public class RunTimePoly {
    public static void main(String[] args) {
        Animals animal1 = new Animals();
        Animals animal2 = new Dog();
        animal1.makeSound();
        animal2.makeSound(); 
    }
}
