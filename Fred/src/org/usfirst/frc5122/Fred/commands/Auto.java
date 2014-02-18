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
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc5122.Fred.Robot;

/**
 *
 */
public class Auto extends CommandGroup {
    
    public  Auto() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
        Robot.drivetrain.setSafetyEnabled(false);
            System.out.println("Starting Autonomous Mode");
        addSequential(new Drive(4, .5, 0));     //drive to goal
            System.out.println("At Goal");
        addSequential(new ThrowBall());         //throw ball
            System.out.println("Ball Thrown");
        //addSequential(new ArmToggle(false));    //put arm up
        //System.out.println("Arm Is Up");
        addParallel(new PullBackThrower(), 4);
        addSequential(new Drive(4.5, -.5, 0), 5); //drive back to start
        addParallel(new PullBackThrower(), 4);
        
            System.out.println("At Start & Thrower Back");
        addSequential(new ArmToggle(false));    //put arm up
            System.out.println("Arm Is Up");
        addSequential(new Drive(4.5, .5, 0));     //drive to goal
        addSequential(new PullBackThrower(), 4);
            System.out.println("At Goal");
        addSequential(new ThrowBall());         //throw ball
            System.out.println("Ball Thrown");
            System.out.println("Stop");
    }
}
