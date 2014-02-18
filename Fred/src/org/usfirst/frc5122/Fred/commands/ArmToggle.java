// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc5122.Fred.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5122.Fred.Robot;
/**
 *
 */
public class  ArmToggle extends Command {
    public static boolean armDown = false;
    public boolean finished = false;
    public ArmToggle() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.arm);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    public ArmToggle(boolean armDown)
    {
        requires(Robot.arm);
        if (this.armDown == armDown)
        {
            finished = true;
        }
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.println("ArmToggle Init");
        finished = false;
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (finished) {
            return;
        }
        System.out.println("Arm: "+armDown);
        if (armDown) {
            Robot.arm.Down();
        } else {
            Robot.arm.Up();
        }
        armDown = !armDown;
        finished = true;
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finished;
    }
    // Called once after isFinished returns true
    protected void end() {
        System.out.println("ArmToggle End");
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        System.out.println("ArmToggle Interrupted");
    }
}
