package adapter_pattern;

public class Main {

    public static void main(String[] args) {
        EnemyTank tank = new EnemyTank();
        EnemyRobot robo = new EnemyRobot();
        EnemyAttacker roboAdapter = new EnemyRobotAdapter(robo);

        System.out.println("The Robot");
        robo.reactToHuman("Jerry");
        robo.walkForward();
        robo.smashWithHands();

        System.out.println("The Tank");
        tank.fireWeapon();
        tank.driveForward();
        tank.assignDriver("Jerry");

        System.out.println("The Robot with Adapter");
        roboAdapter.fireWeapon();
        roboAdapter.driveForward();
        roboAdapter.assignDriver("Jerry");

    }
    
}
