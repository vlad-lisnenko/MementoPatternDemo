package com.lisnenko.pattern;

import com.lisnenko.model.Settings;

public class Memento {
    private final Settings settings;

    public Settings getSettings() {
        return settings;
    }

    public Memento(Settings settings) {
        this.settings = settings;
    }
}
