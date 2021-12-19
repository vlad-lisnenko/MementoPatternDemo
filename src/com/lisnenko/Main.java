package com.lisnenko;

import com.lisnenko.model.Orientation;
import com.lisnenko.model.Settings;
import com.lisnenko.pattern.CareTaker;
import com.lisnenko.pattern.Originator;

public class Main {

    public static void main(String[] args) {

        var originator = new Originator();
        var careTaker = new CareTaker();

        originator.setSettings(new Settings(55.5, true, Orientation.BOOK));
        originator.setSettings(new Settings(100, false, Orientation.BOOK_INVERTED));
        careTaker.add(originator.saveSettingsToMemento());

        originator.setSettings(new Settings(10, true, Orientation.LANDSCAPE));
        careTaker.add(originator.saveSettingsToMemento());

        originator.setSettings(new Settings(99.9, false, Orientation.BOOK));
        System.out.println("Current State: " + originator.getSettings());


        originator.getSettingsFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getSettings());
        originator.getSettingsFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getSettings());
    }
}
