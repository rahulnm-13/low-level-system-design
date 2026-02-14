package behavioral.strategy_pattern.drive_strategy;

public class FastDrive implements DriveStrategy{
    String drive_mode = "FAST";

    @Override
    public String driveMode(){
        return drive_mode;
    }
    
}
