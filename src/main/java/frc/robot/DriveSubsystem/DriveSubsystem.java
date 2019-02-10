/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.DriveSubsystem;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  private static CANSparkMax sparkOne;
  // private static CANSparkMax sparkOne, sparkTwo, sparkThree, sparkFour, sparkFive, sparkSix;
  // private static Joystick leftJoystick, rightJoystick;
  // private static CANEncoder encOne, encTwo, encThree, encFour, encFive, encSix;
  // private CANEncoder[] encLeftArray, encRightArray;
  private AnalogInput infraredSensor;

  public DriveSubsystem(){
    sparkOne = new CANSparkMax(0, MotorType.kBrushless);
    // sparkTwo = new CANSparkMax(1, MotorType.kBrushless);
    // sparkThree = new CANSparkMax(2, MotorType.kBrushless);
    // sparkFour = new CANSparkMax(3, MotorType.kBrushless);
    // sparkFive = new CANSparkMax(4, MotorType.kBrushless);
    // sparkSix = new CANSparkMax(5, MotorType.kBrushless);

    // encOne = sparkOne.getEncoder();
    // encTwo = sparkTwo.getEncoder();
    // encThree = sparkThree.getEncoder();
    // encFour = sparkFour.getEncoder();
    // encFive = sparkFive.getEncoder();
    // encSix = sparkSix.getEncoder();

    // leftJoystick = new Joystick(0);
    // rightJoystick = new Joystick(1);

    // encRightArray = new CANEncoder[]{encOne, encTwo, encThree};
    // encLeftArray = new CANEncoder[]{encFour, encFive, encSix};

  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DriveCommand());
  }


     public void setMotor(double speed){
       sparkOne.set(speed);
     }
//   public void setRightMotors(double speed){
//     sparkOne.set(speed);
//     sparkTwo.set(speed);
//     sparkThree.set(speed);
//   }

//   public void setLeftMotors(double speed){
//     sparkFour.set(-speed);
//     sparkFive.set(-speed);
//     sparkSix.set(-speed);
//   }

//   public double getLeftJoystick(){
//     if (Math.abs(leftJoystick.getRawAxis(1)) >= 0.05){
//       return leftJoystick.getRawAxis(1);
//     }  else {
//       return 0;
//     }
    
//   }

//   public double getRightJoystick(){
//     if (Math.abs(rightJoystick.getRawAxis(1)) >= 0.05) {
//       return rightJoystick.getRawAxis(1);
//     } else {
//       return 0;
//     }
    
//   }

//   public void printEncoders(){
//     System.out.println("Right Encoders : " + getRightValue());
//     System.out.println("Left Encoders : " + getLeftValue());
//   }

//   public double getRightEnoder(){
//     double rvalue = ((encOne.getPosition() + encTwo.getPosition() + encThree.getPosition()) / 3);
//     return rvalue;
//   }

//   public double getLeftEncoder(){
//     double lvalue = ((encFour.getPosition() + encFive.getPosition() + encSix.getPosition()) / 3);
//     return lvalue;
//   }

//   public double getRightValue(){
//     double totalEncoders = 0;
//     double encoderValues = 0;
//     for(CANEncoder i: encRightArray){
//       if(i.getPosition() != 0){
//         encoderValues += i.getPosition();
//         totalEncoders++;
//       }
//     }
//     if(totalEncoders == 0){
//       return 0;
//     } else {
//       return (-encoderValues / totalEncoders);
//     }
    
//   }

//   public double getLeftValue(){
//     double totalEncoders = 0;
//     double encoderValues = 0;
//     for(CANEncoder i: encLeftArray){
//       if(i.getPosition() != 0){
//         encoderValues += i.getPosition();
//         totalEncoders++;
//       }
//     }
//     if(totalEncoders == 0){
//       return 0;
//     } else {
//       return (encoderValues / totalEncoders);
//     }
    
//   }

  public void getInfrared(){
    System.out.println("Raw " + infraredSensor.getValue());
    System.out.println("Average Raw " + infraredSensor.getAverageValue());
    System.out.println("Voltage " + infraredSensor.getVoltage());
    System.out.println("Average Voltage " + infraredSensor.getAverageVoltage());
  }

  
 }

