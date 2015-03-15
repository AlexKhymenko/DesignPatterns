package PrototypePattern;

/**
 * Created by alexkhymenko on 3/15/15.
 */
public class Dog implements Animal {


    @Override
    public Animal makeCopy() {
        Dog dog = null;
        try {
            dog = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return dog;
    }
}
