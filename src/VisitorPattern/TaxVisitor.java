package VisitorPattern;

/**
 * Created by alexkhymenko on 3/15/15.
 */
public class TaxVisitor implements Visitor {

    @Override
    public double visit(Liquer liquer) {
        return liquer.getPrice() * 0.15;
    }

    @Override
    public double visit(Book book) {
        return book.getPrice() * 0.30;
    }

    @Override
    public double visit(Computer computer) {
        return computer.getPrice() * 0.45;
    }
}
