package VisitorPattern;

/**
 * Created by alexkhymenko on 3/15/15.
 */
public class Main {

    public static void main(String[] args) {
        Visitor visitor = new TaxVisitor();
        Visitable mac = new Computer(50.0);
        mac.accept(visitor);
        System.out.println(mac.accept(visitor));
    }
}
