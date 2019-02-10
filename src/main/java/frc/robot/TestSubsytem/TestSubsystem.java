/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.TestSubsytem;



import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class TestSubsystem extends Subsystem {
  
  private DigitalInput photoelectricOneDark, photoelectricOneLight;
  private AnalogInput photoelectricOneDarkA, photoelectricOneLightA;
  

  public TestSubsystem(){
      photoelectricOneDark = new DigitalInput(0);
      photoelectricOneLight = new DigitalInput(1);
      photoelectricOneDarkA = new AnalogInput(0);
      photoelectricOneLightA = new AnalogInput(1);

  }

  public void getSensorDO(){
    System.out.println("Dark Input DO " + photoelectricOneDark.get());
    System.out.println("Light Input DO " + photoelectricOneLight.get());
  }

  public void getSensorAI(){
    System.out.println("Dark Input Average Value" + photoelectricOneDarkA.getAverageValue());
    System.out.println("Dark Input value " + photoelectricOneDarkA.getValue());
    System.out.println("Light Input Average Value " + photoelectricOneLightA.getAverageValue());
    System.out.println("Light Input Average Value " + photoelectricOneLightA.getValue());
  }
  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new TestCommand());
  }
}
