package com.example.springboot.creationalpatterns.abstractfactory.factories.macos;

import com.example.springboot.creationalpatterns.abstractfactory.factories.GUIFactory;
import com.example.springboot.creationalpatterns.abstractfactory.components.Button;
import com.example.springboot.creationalpatterns.abstractfactory.components.Checkbox;
import com.example.springboot.creationalpatterns.abstractfactory.components.macos.MacOSButton;
import com.example.springboot.creationalpatterns.abstractfactory.components.macos.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
