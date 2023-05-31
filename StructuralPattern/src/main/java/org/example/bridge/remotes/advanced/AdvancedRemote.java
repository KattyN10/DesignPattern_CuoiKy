package org.example.bridge.remotes.advanced;


import org.example.bridge.devices.Device;
import org.example.bridge.remotes.basic.BasicRemote;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
