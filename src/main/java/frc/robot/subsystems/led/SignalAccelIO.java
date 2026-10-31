package frc.robot.subsystems.led;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import org.littletonrobotics.junction.AutoLog;

public interface SignalAccelIO {
  @AutoLog
  public static class SignalAccelIOInputs {
    // it's the roborio. it's probably connected.
    public boolean connected = false;
    public double d2x = 0.0;
    public double d2y = 0.0;
    public double d2z = 0.0;

    // TODO: set to 2g from 8g?
    public BuiltInAccelerometer.Range range = BuiltInAccelerometer.Range.k8G;
  }

  public default void updateInputs(SignalAccelIOInputs inputs) {}
}
