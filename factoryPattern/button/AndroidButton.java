package org.example.factoryPattern.button;

public class AndroidButton implements Button{


    @Override
    public void click() {
        System.out.println("Clicked Android Button");
    }
}
