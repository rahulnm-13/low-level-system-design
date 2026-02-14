package behavioral.strategy_pattern.vehicle;

import behavioral.strategy_pattern.drive_strategy.DriveStrategy;

public class OffRoadVehicle implements Vehicle {
    DriveStrategy drive_strategy;
    String vehicle_type = "OFF ROAD TYPE VEHICLE";

    public OffRoadVehicle(DriveStrategy strategy){
        drive_strategy = strategy;
    }

    @Override
    public void setDriveStrategy(DriveStrategy strategy){
        drive_strategy = strategy;
    }

    @Override
    public String getVehicleType(){
        return vehicle_type;
    }

    @Override
    public void runDrive(){
        System.err.println("Running "+getVehicleType()+" in "+drive_strategy.driveMode()+" drive mode");
    }
}
