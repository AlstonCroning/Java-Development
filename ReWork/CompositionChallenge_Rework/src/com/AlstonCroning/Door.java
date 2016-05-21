package com.AlstonCroning;

public class Door {
    private boolean closeOpen;

    public Door(boolean closeOpen) {
        this.closeOpen = closeOpen;
    }

    public void useDoor(boolean onOff) {
        if(onOff) {
            openDoor();
        } else {
            closeDoor();
        }
    }

    private void openDoor() {
        System.out.println("Openinig Door");
    }

    private void closeDoor() {
        System.out.println("Closing Door");
    }
}
