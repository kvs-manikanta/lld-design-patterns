package org.example.factoryPattern;

import org.example.factoryPattern.button.AndroidButton;
import org.example.factoryPattern.button.Button;
import org.example.factoryPattern.button.IOSButton;
import org.example.factoryPattern.menu.IOSMenu;
import org.example.factoryPattern.menu.Menu;


public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
