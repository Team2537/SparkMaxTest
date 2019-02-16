/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Add your docs here.
 */
public class Ports {
    // CAN Bus ports
    public static final int
        DRIVE_MOTOR_RIGHT_BACK  = 1,
        DRIVE_MOTOR_RIGHT_TOP   = 2,
        DRIVE_MOTOR_RIGHT_FRONT = 3,
        DRIVE_MOTOR_LEFT_FRONT  = 4,
        DRIVE_MOTOR_LEFT_TOP    = 5,
        DRIVE_MOTOR_LEFT_BACK   = 6, 
        ARM_MOTOR = 7,
        WRIST_MOTOR = 8,
        INTAKE_ARM_FLYWHEEL = 9,
        INTAKE_FLYWHEEL_ONE = 10,
        INTAKE_FLYWHEEL_TWO = 11
    ;

    //Analog Ports
    public static final int 
        WRIST_POTENTIOMETER = 0
    ;

    // Drive station USB ports
    public static final int
        LEFT_JOYSTICK  = 0,
        RIGHT_JOYSTICK = 1
    ;

        
    // infrared sensor ports for intake
    public static final int
        INTAKE_INFRARED = 0
    ;

    // solenoid ports
    public static final int
        INTAKE_PNEUMATIC_ONE = 0 ,
        INTAKE_PNEUMATIC_TWO = 1 ,
        CLIMB_SOLENOID_ONE = 2, 
        CLIMB_SOLENOID_TWO = 3
    ;

    //buttons left joystick
    public static final int
        ARM_INTAKE_FLYWHEEL_IN = 1,
        WRIST_UP = 3,
        WRIST_DOWN = 2,
        INTAKE_FLYWHEEL_IN = 4,
        INTAKE_FLYWHEEL_OUT = 5
        
    ;

    //buttons right joystick
    public static final int
        ARM_UP_BUTTON = 3,
        ARM_DOWN_BUTTON = 2,
        ARM_INTAKE_FLYWHEEL_OUT = 1,
        INTAKE_PNEUMATIC_EXTEND = 5,
        CLIMB_ENGAGE_CLUTCH = 4

    ;



}
