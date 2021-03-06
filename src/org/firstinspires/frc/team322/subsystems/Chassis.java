// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.firstinspires.frc.team322.subsystems;

import org.firstinspires.frc.team322.RobotMap;
import org.firstinspires.frc.team322.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.NeutralMode;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Chassis extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final WPI_TalonSRX leftFrontDriveMotor = RobotMap.chassisleftFrontDriveMotor;
    private final WPI_TalonSRX leftRearDriveMotor = RobotMap.chassisleftRearDriveMotor;
    private final SpeedControllerGroup leftSideDriveMotors = RobotMap.chassisleftSideDriveMotors;
    private final WPI_TalonSRX rightFrontDriveMotor = RobotMap.chassisrightFrontDriveMotor;
    private final WPI_TalonSRX rightRearDriveMotor = RobotMap.chassisrightRearDriveMotor;
    private final SpeedControllerGroup rightSideDriveMotors = RobotMap.chassisrightSideDriveMotors;
    private final DifferentialDrive robotDrive = RobotMap.chassisrobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new DriveWithJoystick());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void driveWithJoystick(XboxController driveStick) {
    	robotDrive.arcadeDrive(-(driveStick.getY(Hand.kLeft)), driveStick.getX(Hand.kRight), true);
    }

    public void brakesOn() {
    	leftFrontDriveMotor.setNeutralMode(NeutralMode.Brake);
        leftRearDriveMotor.setNeutralMode(NeutralMode.Brake);
        rightFrontDriveMotor.setNeutralMode(NeutralMode.Brake);
        rightRearDriveMotor.setNeutralMode(NeutralMode.Brake);
    }
    
    public void brakesOff() {
    	leftFrontDriveMotor.setNeutralMode(NeutralMode.Coast);
        leftRearDriveMotor.setNeutralMode(NeutralMode.Coast);
        rightFrontDriveMotor.setNeutralMode(NeutralMode.Coast);
        rightRearDriveMotor.setNeutralMode(NeutralMode.Coast);
    }
    
    public int getEncoderData(int encoder) {
    	switch(encoder)
    	{
    		case 1:
    			return leftFrontDriveMotor.getSensorCollection().getQuadraturePosition();
    		
    		case 2:
    			return leftRearDriveMotor.getSensorCollection().getQuadraturePosition();
    		
    		case 3:
    			return rightFrontDriveMotor.getSensorCollection().getQuadraturePosition();
    		
    		case 4:
    			return rightRearDriveMotor.getSensorCollection().getQuadraturePosition();
    		
    		default:
    			return 0;
    	}
    }
    
}

