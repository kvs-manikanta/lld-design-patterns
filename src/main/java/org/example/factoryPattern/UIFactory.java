package org.example.factoryPattern;

import org.example.factoryPattern.button.Button;
import org.example.factoryPattern.menu.Menu;

//create the factory interface which contains the factory methods which helps to create corresponding object

public interface UIFactory {

    Button createButton();
    Menu createMenu();
}
