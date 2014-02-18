// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc5122.Fred.subsystems;
import org.usfirst.frc5122.Fred.RobotMap;
import org.usfirst.frc5122.Fred.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Drivetrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController rR = RobotMap.drivetrainRR;
    SpeedController lF = RobotMap.drivetrainLF;
    SpeedController lR = RobotMap.drivetrainLR;
    SpeedController rF = RobotMap.drivetrainRF;
    RobotDrive robotDrive4 = RobotMap.drivetrainRobotDrive4;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new ArcadeDrive());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void takeJoystickInputs(Joystick js1, boolean reverse)
    {
        if (reverse) {
            robotDrive4.arcadeDrive(js1.getY(), js1.getX()*-1, false);
        } else {
            robotDrive4.arcadeDrive(js1.getY()*-1, js1.getX()*-1, false);
        }
    }
    public void Stop()
    {
        robotDrive4.drive(0, 0);
    }
    public void Drive(double outputMagnitude, double curve)
    {
        robotDrive4.drive(outputMagnitude, curve);
    }
    
    public void ArcadeDrive(double moveValue, double rotateValue)
    {
        robotDrive4.arcadeDrive(moveValue*-1, rotateValue, true);
    }
    public void setSafetyEnabled(boolean en)
    {
        System.out.println("Set Safety "+en);
        robotDrive4.setSafetyEnabled(en);
    }
}