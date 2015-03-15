package BuilderPattern;

/**
 * Created by alexkhymenko on 3/15/15.
 */
public class NewRobotBuilder implements RobotBuilder {

    private Robot robot;

    public NewRobotBuilder() {
        robot = new Robot();
    }

    @Override
    public void buildRobotChest() {
        robot.setChest("Very shiny Chest");

    }

    @Override
    public void buildRobotLegs() {
        robot.setLegs("Very shiny Legs");
    }

    @Override
    public void buildRobotHead() {
        robot.setHead("Very Awesome head");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
