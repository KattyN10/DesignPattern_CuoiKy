package com.example.springboot.creationalpatterns.abstractfactory.factories;

import com.example.springboot.creationalpatterns.abstractfactory.components.Button;
import com.example.springboot.creationalpatterns.abstractfactory.components.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
