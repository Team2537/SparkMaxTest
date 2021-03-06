/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.DriveSubsystem;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.HumanInput;
import frc.robot.Robot;

public class DriveCommand extends Command {

  private boolean smartBoardBool = false;
  private long startTime;

  public DriveCommand() {
    requires(Robot.drivesys);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    System.out.println("we rollin");
    System.out.println(smartBoardBool);
    SmartDashboard.putBoolean("testBool", smartBoardBool);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    
    Robot.drivesys.setLeftMotors(HumanInput.getJoystickAxisLeft(HumanInput.AXIS_Y));
    Robot.drivesys.setRightMotors(HumanInput.getJoystickAxisRight(HumanInput.AXIS_Y));
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
