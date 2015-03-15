package VisitorPattern;

/**
 * Created by alexkhymenko on 3/15/15.
 */
public interface Visitor {

    public double visit(Liquer liquer);

    public double visit(Book book);

    public double visit(Computer computer);

}
