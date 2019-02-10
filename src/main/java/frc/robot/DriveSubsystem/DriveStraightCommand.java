/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

// package frc.robot.DriveSubsystem;

// import edu.wpi.first.wpilibj.command.Command;
// import frc.robot.Robot;

// public class DriveStraightCommand extends Command {
//   double leftEncoderStartValue;
//   double rightEncoderStartValue;

//   public DriveStraightCommand() {
//     requires(Robot.drivesys);
//   }

//   // Called just before this Command runs the first time
//   @Override
//   protected void initialize() {
//     leftEncoderStartValue = Robot.drivesys.getLeftValue();
//     rightEncoderStartValue = Robot.drivesys.getRightValue();
//     Robot.drivesys.setLeftMotors(-0.5);
//     Robot.drivesys.setRightMotors(-0.5);
//   }

//   // Called repeatedly when this Command is scheduled to run
//   @Override
//   protected void execute() {
    
//   }

//   // Make this return true when this Command no longer needs to run execute()
//   @Override
//   protected boolean isFinished() {
//     return ((((Robot.drivesys.getLeftValue() - leftEncoderStartValue) + (Robot.drivesys.getRightValue() - rightEncoderStartValue)) / 2) >= 150);

//   }

//   // Called once after isFinished returns true
//   @Override
//   protected void end() {
//     Robot.drivesys.setLeftMotors(0);
//     Robot.drivesys.setRightMotors(0);
//   }

//   // Called when another command which requires one or more of the same
//   // subsystems is scheduled to run
//   @Override
//   protected void interrupted() {
//     Robot.drivesys.setLeftMotors(0);
//     Robot.drivesys.setRightMotors(0);
//   }
// }
