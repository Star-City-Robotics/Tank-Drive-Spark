// Copyright (c) 2021-2026 Littleton Robotics
// http://github.com/Mechanical-Advantage
//
// Use of this source code is governed by a BSD
// license that can be found in the LICENSE file
// at the root directory of this project.

package frc.robot;

import com.pathplanner.lib.config.ModuleConfig;
import com.pathplanner.lib.config.RobotConfig;
import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.RobotBase;

/**
 * This class defines the runtime mode used by AdvantageKit. The mode is always "real" when running
 * on a roboRIO. Change the value of "simMode" to switch between "sim" (physics sim) and "replay"
 * (log replay from a file).
 */
public final class Constants {
  // NOTE: change robotBuild to Mode.KITBOT2026;
  public static final Mode robotBuild = Mode.KITBOT;
  public static final Mode simMode = Mode.SIM;
  public static final Mode currentMode = RobotBase.isReal() ? robotBuild : simMode;

  public static enum Mode {
    /** Running on a real robot. */
    KITBOT,
    KITBOT2026,

    /** Running a physics simulator. */
    SIM,

    /** Replaying from a log file. */
    REPLAY;
  }

  public static final double maxSpeedMetersPerSec = 4.0;
  public static final double trackWidth = Units.inchesToMeters(26.0);

  public static final int pigeonCanId = 9;

  // TODO: refactor motor configuration?
  public static final int currentLimit = 60;
  public static final double wheelRadiusMeters = Units.inchesToMeters(3.0);
  public static final double motorReduction = 10.71;
  public static final DCMotor gearbox = DCMotor.getCIM(2);

  // TODO: refactor PathPlanner configuration?
  // TODO: tune pathplanner
  public static final double robotMassKg = 74.088;
  public static final double robotMOI = 6.883;
  public static final double wheelCOF = 1.2;
  public static final RobotConfig ppConfig =
      new RobotConfig(
          robotMassKg,
          robotMOI,
          new ModuleConfig(
              wheelRadiusMeters,
              maxSpeedMetersPerSec,
              wheelCOF,
              gearbox.withReduction(motorReduction),
              currentLimit,
              2),
          trackWidth);
}
