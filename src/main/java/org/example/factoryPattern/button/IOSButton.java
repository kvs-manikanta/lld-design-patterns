package org.example.factoryPattern.button;

public class IOSButton implements Button{
    @Override
    public void click() {
        System.out.println("Clicked IOS Button");
    }
}
