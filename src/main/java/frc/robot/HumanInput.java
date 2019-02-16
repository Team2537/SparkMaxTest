/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.intake.ArmFlywheelCommand;
import frc.robot.intake.FlywheelCommand;

/**
 * Add your docs here.
 */
public class HumanInput {
    public static Joystick joystickLeft = new Joystick(Ports.LEFT_JOYSTICK);
    public static Joystick joystickRight = new Joystick(Ports.RIGHT_JOYSTICK);
    // Button aliases
    // public static Button 

    public static JoystickButton intakeFlywheelsForward = new JoystickButton(joystickLeft, Ports.INTAKE_FLWYEEL_OUT);
    public static JoystickButton intakeFlywheelsBackward = new JoystickButton(joystickLeft, Ports.INTAKE_FLWYEEL_OUT);
    public static JoystickButton armFlywheelIn = new JoystickButton(joystickLeft, Ports.ARM_INTAKE_FLYWHEEL_IN);
    public static JoystickButton armFlywheelOut = new JoystickButton(joystickRight, Ports.ARM_INTAKE_FLYWHEEL_OUT);
    public static JoystickButton intakeSolExtend = new JoystickButton(joystickLeft, Ports.INTAKE_PNEUMATIC_EXTEND);
    public static JoystickButton climbEngageClutch = new JoystickButton(joystickLeft, Ports.CLIMB_ENGAGE_CLUTCH);
    public static JoystickButton increasearmbutton = new JoystickButton(joystickRight, Ports.ARM_UP_BUTTON);
    public static JoystickButton decreasearmbutton = new JoystickButton(joystickRight, Ports.ARM_DOWN_BUTTON);
    public static JoystickButton wristUpButton = new JoystickButton(joystickLeft, Ports.WRIST_UP);
    public static JoystickButton wristDownButton = new JoystickButton(joystickLeft, Ports.WRIST_DOWN);

    public static void registerButtons(){
        whileHeldCommand(armFlywheelIn, new ArmFlywheelCommand(true));
        whileHeldCommand(armFlywheelOut, new ArmFlywheelCommand(false));
        whileHeldCommand(intakeFlywheelsForward, new FlywheelCommand(true));
        whileHeldCommand(intakeFlywheelsBackward, new FlywheelCommand(false));
    }

    public static final int AXIS_X = 0, AXIS_Y = 1;
    private static double getJoystickAxis(int axis, Joystick joystick){
        double val = joystick.getRawAxis(axis);
        if(Math.abs(val) <= 0.1) return 0;
        else return val;
    }
    public static double getJoystickAxisLeft(int axis){
        return getJoystickAxis(axis, joystickLeft);
    }
    public static double getJoystickAxisRight(int axis){
        return getJoystickAxis(axis, joystickRight);
    }

    private static void whenPressedCommand(Button button, Command command){
        button.whenPressed(command);
    }
    private static void whileHeldCommand(Button button, Command command){
        button.whileHeld(command);
    }
    private static void whenReleasedCommand(Button button, Command command){
        button.whenReleased(command);
    }
}
