package com.example.springboot.creationalpatterns.abstractfactory.components.windows;

import com.example.springboot.creationalpatterns.abstractfactory.components.Button;

public class WindowsButton implements Button {
    @Override
    public String paint() {
        return "You have created WindowsButton.";
    }
}
