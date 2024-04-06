package org.example.factoryPattern;

import org.example.factoryPattern.button.Button;
import org.example.factoryPattern.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter=new Flutter();

        UIFactory uiFactory=flutter.getUIFactoryObject(SupportedPlatform.IOS);
        /*
        Here if client passing incorrect input then we might get NULL Pointer Exception
        So create enum to avoid null pointer
        */

        Button button=uiFactory.createButton();
        Menu menu=uiFactory.createMenu();
        button.click();
        menu.showMenu();
    }
}
