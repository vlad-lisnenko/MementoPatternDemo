package com.lisnenko.model;

public class Settings {

    private final double brightness; // 0 - 100
    private final boolean darkMode;
    private final Orientation displayOrientation;

    public Settings(double brightness, boolean darkMode, Orientation displayOrientation) {
        this.brightness = brightness;
        this.darkMode = darkMode;
        this.displayOrientation = displayOrientation;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "brightness=" + brightness +
                ", darkMode=" + darkMode +
                ", displayOrientation=" + displayOrientation +
                '}';
    }
}
