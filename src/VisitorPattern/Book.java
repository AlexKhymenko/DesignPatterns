package VisitorPattern;

/**
 * Created by alexkhymenko on 3/15/15.
 */
public class Book implements Visitable {

    private double price;

    public Book(double price) {
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
