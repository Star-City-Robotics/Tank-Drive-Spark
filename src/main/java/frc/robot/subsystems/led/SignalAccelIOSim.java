package frc.robot.subsystems.led;

import edu.wpi.first.wpilibj.simulation.BuiltInAccelerometerSim;

public class SignalAccelIOSim implements SignalAccelIO {

  private final BuiltInAccelerometerSim accel;

  public SignalAccelIOSim() {
    this.accel = new BuiltInAccelerometerSim();
  }

  public void updateInputs(SignalAccelIOInputs inputs) {
    inputs.connected = true;
    inputs.d2x = accel.getX();
    inputs.d2y = accel.getY();
    inputs.d2z = accel.getZ();
  }
}
