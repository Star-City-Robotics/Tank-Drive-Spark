package frc.robot.subsystems.led;

import org.littletonrobotics.junction.AutoLog;

public interface LEDIO {

  @AutoLog
  public static class LEDIOInputs {
    // these should *always* have a default value in the interface
    public boolean connected = false;
    public LEDProgram program = LEDProgram.NONE;
  }

  public enum LEDProgram {
    WAVE("WAVE"),
    ACCEL("ACCEL"),
    STATUS("STATUS"),
    NONE("NONE");

    LEDProgram(String name) {}
  }

  /** This gets implemented in the subsystem implementation. */
  public default void updateInputs() {}
}
