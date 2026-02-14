package behavioral.strategy_pattern.vehicle;

import behavioral.strategy_pattern.drive_strategy.DriveStrategy;

public class SportyVehicle implements Vehicle {
    DriveStrategy drive_strategy;
    String vehicle_type = "SPORT TYPE VEHICLE";

    public SportyVehicle(DriveStrategy strategy){
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
