/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.DriveSubsystem;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  private static CANSparkMax sparkOne, sparkTwo, sparkThree, sparkFour, sparkFive, sparkSix;
  private static Joystick leftJoystick, rightJoystick;

  public DriveSubsystem(){
    sparkOne = new CANSparkMax(0, MotorType.kBrushless);
    sparkTwo = new CANSparkMax(1, MotorType.kBrushless);
    sparkThree = new CANSparkMax(2, MotorType.kBrushless);
    sparkFour = new CANSparkMax(3, MotorType.kBrushless);
    sparkFive = new CANSparkMax(4, MotorType.kBrushless);
    sparkSix = new CANSparkMax(5, MotorType.kBrushless);

    leftJoystick = new Joystick(0);
    rightJoystick = new Joystick(1);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DriveCommand());
  }

  public void setLeftMotors(double speed){
    sparkOne.set(speed);
    sparkTwo.set(speed);
    sparkThree.set(speed);
  }

  public void setRightMotors(double speed){
    sparkFour.set(speed);
    sparkFive.set(speed);
    sparkSix.set(speed);
  }

  public double getLeftJoystick(){
    return leftJoystick.getRawAxis(0);
  }

  public double getRightJoystick(){
    return rightJoystick.getRawAxis(0);
  }
}

