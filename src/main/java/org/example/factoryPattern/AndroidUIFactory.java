package org.example.factoryPattern;

import org.example.factoryPattern.button.AndroidButton;
import org.example.factoryPattern.button.Button;
import org.example.factoryPattern.menu.AndroidMenu;
import org.example.factoryPattern.menu.Menu;

public class AndroidUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
