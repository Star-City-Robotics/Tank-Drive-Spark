package frc.robot.subsystems.led;

import frc.robot.subsystems.led.LEDIO.LEDIOInputs;

// NOTE: this isn't a subsystem because:
//
// 1. No commands should be scheduled to own it
// 2. Must be manually scheduled at end of Robot#robotPeriodic
// 3. It receives signals from most other subsystems
public class LEDSubsystem {
  public LEDIOInputs io;

  private final SignalAccelIO accelio;
  // private final SignalAccelIOInputsAutoLogged = new SignalAccelIOInputsAutoLogged();

  public LEDSubsystem(SignalAccelIO accelio) {
    this.accelio = accelio;
  }

  public void periodic() {
    // this.accelio.updateInputs();
  }
}
