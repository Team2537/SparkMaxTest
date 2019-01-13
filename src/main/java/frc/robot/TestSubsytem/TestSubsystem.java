/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.TestSubsytem;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.ConfigParameter;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class TestSubsystem extends Subsystem {
  
  private static CANSparkMax sparkMax;
  private static CANEncoder enc;
  private Joystick stick;

  public TestSubsystem(){

    sparkMax = new CANSparkMax(0, MotorType.kBrushless);
    // stick = new Joystick(0);
    enc = new CANEncoder(sparkMax);
    
  }

  public void configureSpark(){
    sparkMax.setParameter(ConfigParameter.kEncoderCountsPerRev, 1);
  }

  public void returnSpark(){
    // System.out.println(sparkMax.getEncoder());
    System.out.println(enc.getPosition());
    
    // System.out.println(enc.getVelocity());
    
  }

  public void setMotor(double speed){
    sparkMax.set(speed);
  }

  // public double getStick(){
  //   return stick.getRawAxis(0);
  // }

  public double getEncoder(){
    return enc.getPosition();
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new TestCommand());
  }
}
