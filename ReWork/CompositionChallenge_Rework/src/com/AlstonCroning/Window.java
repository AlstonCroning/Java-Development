package com.AlstonCroning;

public class Window {
    private int numOfWindows;

    public Window(int numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public void useWindow(boolean openClose) {
        if(openClose) {
            openWindow();
        } else {
            closeWindow();
        }
    }

    private void openWindow() {
        System.out.println("Opening Window");
    }
    private void closeWindow() {
        System.out.println("closing window");
    }
}
