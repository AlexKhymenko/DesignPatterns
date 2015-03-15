package BuilderPattern;

/**
 * Created by alexkhymenko on 3/15/15.
 */
public class Robot implements RobotPlan{
    private String head;
    private String legs;
    private String chest;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getChest() {
        return chest;
    }

    public void setChest(String chest) {
        this.chest = chest;
    }
}
