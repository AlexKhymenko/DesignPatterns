package VisitorPattern;

/**
 * Created by alexkhymenko on 3/15/15.
 */
public class Computer implements Visitable {

    private double price;

    public Computer(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
