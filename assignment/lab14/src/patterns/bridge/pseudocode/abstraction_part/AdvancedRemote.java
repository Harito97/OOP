package patterns.bridge.pseudocode.abstraction_part;

import patterns.bridge.pseudocode.implementation_part.Device;

public class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
