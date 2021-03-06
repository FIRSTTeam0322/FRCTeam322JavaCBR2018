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

import com.analog.adis16448.frc.ADIS16448_IMU;

import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.PowerDistributionPanel;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class ChassisSensors extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final PowerDistributionPanel powerDistributionPanel = RobotMap.chassisSensorspowerDistributionPanel;
    private final ADIS16448_IMU IMU = RobotMap.chassisSensorsIMU;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


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
	public double getPitch() {
		return IMU.getPitch();
	}
	
	public double getRoll() {
		return IMU.getRoll();
	}
	
	public double getYaw() {
		return IMU.getYaw();
	}
	public double getAngleX() {
	    return IMU.getAngleX();
	}

	public double getAngleY() {
		return IMU.getAngleY();
	}

	public double getAngleZ() {
		return IMU.getAngleZ();
	}

	public double getAccelX() {
	    return IMU.getAccelX();
	}

	public double getAccelY() {
	    return IMU.getAccelY();
	}

	public double getAccelZ() {
	    return IMU.getAccelZ();
	}

	public double getMagX() {
	    return IMU.getMagX();
	}

	public double getMagY() {
	    return IMU.getMagY();
	}

	public double getMagZ() {
		return IMU.getMagZ();
	}

	public double getBarometricPressure() {
	    return IMU.getBarometricPressure();
	}

	public double getTemperature() {
	    return IMU.getTemperature();
	}
}
