package VisitorPattern;

/**
 * Created by alexkhymenko on 3/15/15.
 */
public interface Visitable {

    public double accept(Visitor visitor);

}
