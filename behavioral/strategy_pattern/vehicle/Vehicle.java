package behavioral.strategy_pattern.vehicle;

import behavioral.strategy_pattern.drive_strategy.DriveStrategy;

public interface Vehicle {
    public String getVehicleType();
    public void setDriveStrategy(DriveStrategy strategy);
    public void runDrive();

}
