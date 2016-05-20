package com.AlstonCroning;

public class Lamp {
    private int lights;
    private boolean OnOff;

    public Lamp(int lights, boolean onOff) {
        this.lights = lights;
        OnOff = onOff;
    }

    public void useSwitch(boolean onOff) {
        if(onOff) {
            System.out.println("Lights Turning On");
        } else {
            System.out.println("Lights Turning off");
        }
    }

    public int getLights() {
        return lights;
    }

    public boolean isOnOff() {
        return OnOff;
    }
}
