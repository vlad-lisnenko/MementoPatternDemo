package com.lisnenko.pattern;

import com.lisnenko.model.Settings;

public class Originator {
    private Settings settings;

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public Memento saveSettingsToMemento(){
        return new Memento(settings);
    }

    public void getSettingsFromMemento(Memento memento){
        settings = memento.getSettings();
    }
}
