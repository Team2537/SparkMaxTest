/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.arm;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.HumanInput;
import frc.robot.Robot;

public class ArmCommand extends Command {
  public ArmCommand() {
    requires(Robot.armsys);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if(HumanInput.increasearmbutton.get()){
      Robot.armsys.setArmMotor(0.5);
    } else if (HumanInput.decreasearmbutton.get()){
      Robot.armsys.setArmMotor(-0.5);
    } else {
      Robot.armsys.setArmMotor(0);
    }

    if(HumanInput.wristUpButton.get()){
      Robot.armsys.setWristMotor(0.5);
    } else if (HumanInput.wristDownButton.get()){
      Robot.armsys.setWristMotor(-0.5);
    } else {
      Robot.armsys.setWristMotor(0);
    }

    System.out.println("POTNETIOMETER: " + Robot.armsys.getPotentiometer());
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.armsys.setWristMotor(0);
    Robot.armsys.setArmMotor(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    Robot.armsys.setWristMotor(0);
    Robot.armsys.setArmMotor(0);
  }
}
