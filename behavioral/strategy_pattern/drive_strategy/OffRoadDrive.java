package behavioral.strategy_pattern.drive_strategy;

public class OffRoadDrive implements DriveStrategy {
    String drive_mode = "OFF_ROAD";

    @Override
    public String driveMode(){
        return drive_mode;
    }
    
}
