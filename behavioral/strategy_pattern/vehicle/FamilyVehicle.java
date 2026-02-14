package behavioral.strategy_pattern.vehicle;

import behavioral.strategy_pattern.drive_strategy.*;

public class FamilyVehicle implements Vehicle{
    DriveStrategy drive_strategy;
    String vehicle_type = "FAMILY TYPE VEHICLE";

    public FamilyVehicle(DriveStrategy strategy){
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
        System.out.println("Running "+getVehicleType()+" in "+drive_strategy.driveMode()+" drive mode");
    }
}
