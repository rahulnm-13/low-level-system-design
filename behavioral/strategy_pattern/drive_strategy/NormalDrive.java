package behavioral.strategy_pattern.drive_strategy;

public class NormalDrive implements DriveStrategy{
    String drive_mode = "NORMAL";

    @Override
    public String driveMode(){
        return drive_mode;
    }
    
}
