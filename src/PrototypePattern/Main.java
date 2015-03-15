package PrototypePattern;

/**
 * Created by alexkhymenko on 3/15/15.
 */
public class Main {
    public static void main(String[] args) {

        AnimalFactory animalFactory = new AnimalFactory();
        Animal dog = new Dog();
        Animal copyDog = animalFactory.makeCopy(dog);
        System.out.println(dog.hashCode());
        System.out.println(copyDog.hashCode());
    }
}
