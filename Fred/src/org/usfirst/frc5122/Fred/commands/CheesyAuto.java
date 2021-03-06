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
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class CheesyAuto extends CommandGroup {
    
    public  CheesyAuto() {
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
		
		double speedFWD = 0.65;
        double time2goal = 2;
        // Single ball with wait based on IR
        addSequential(new Debug("Starting Autonomous"));
        addParallel(new DelayedArmDown(0));         //wait for the given time then put the arm down
        addSequential(new Drive(time2goal, speedFWD, 0));      //drive to goal //time, move, turn
        addSequential(new Debug("At Goal"));
		addSequential(new WaitCommand(1));
        addSequential(new WaitForCheesy(2));
        addSequential(new ThrowBallFast());
        addSequential(new Debug("Pullback!"));
//        addParallel(new PullBackThrower(true));		//this really shouldn't be needed
        addSequential(new Debug("Done"));

    }
}
