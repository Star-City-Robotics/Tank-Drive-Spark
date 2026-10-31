package frc.robot.subsystems.led;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;

public class SignalAccelIORio implements SignalAccelIO {
  // This is a JNI object and it can crash pretty hard.
  private final BuiltInAccelerometer accel =
      new BuiltInAccelerometer(BuiltInAccelerometer.Range.k8G);

  public SignalAccelIORio() {}

  public void updateInputs(SignalAccelIOInputs inputs) {
    // unsure how to query. It's a "Sendable" object
    // it's the roborio. it's probably connected.
    inputs.connected = true;
    inputs.d2x = accel.getX();
    inputs.d2y = accel.getY();
    inputs.d2z = accel.getZ();
  }
}
