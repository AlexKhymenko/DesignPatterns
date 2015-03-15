package BuilderPattern;

/**
 * Created by alexkhymenko on 3/15/15.
 */
public class RobotEngineer {

    RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public void makeRobot() {
        robotBuilder.buildRobotChest();
        robotBuilder.buildRobotHead();
        robotBuilder.buildRobotLegs();
    }

    public Robot getRobot() {
        return robotBuilder.getRobot();
    }

}
