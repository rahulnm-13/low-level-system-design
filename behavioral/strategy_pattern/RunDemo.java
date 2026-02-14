package behavioral.strategy_pattern;

import behavioral.strategy_pattern.drive_strategy.*;
import behavioral.strategy_pattern.vehicle.*;

public class RunDemo {
    public static void main(String[] args) {
        DriveStrategy fast = new FastDrive();
        Vehicle family_car = new FamilyVehicle(fast);

        family_car.runDrive();

    }
}
