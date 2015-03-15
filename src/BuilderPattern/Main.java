package BuilderPattern;

/**
 * Created by alexkhymenko on 3/15/15.
 */
public class Main {

    public static void main(String[] args) {

        RobotBuilder robotBuilder = new NewRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);
        robotEngineer.makeRobot();

        Robot mike = robotEngineer.getRobot();

        System.out.println(mike.getChest());
        System.out.println(mike.getLegs());
    }
}
