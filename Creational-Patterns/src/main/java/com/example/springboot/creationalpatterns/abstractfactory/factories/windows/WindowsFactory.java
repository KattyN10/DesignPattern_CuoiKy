package com.example.springboot.creationalpatterns.abstractfactory.factories.windows;

import com.example.springboot.creationalpatterns.abstractfactory.factories.GUIFactory;
import com.example.springboot.creationalpatterns.abstractfactory.components.Button;
import com.example.springboot.creationalpatterns.abstractfactory.components.Checkbox;
import com.example.springboot.creationalpatterns.abstractfactory.components.windows.WindowsButton;
import com.example.springboot.creationalpatterns.abstractfactory.components.windows.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
