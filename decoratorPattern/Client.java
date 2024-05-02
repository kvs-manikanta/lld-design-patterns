package org.example.decoratorPattern;

import org.example.decoratorPattern.addOns.Meat;
import org.example.decoratorPattern.addOns.Sauces;
import org.example.decoratorPattern.addOns.Veggies;
import org.example.decoratorPattern.breads.BrownBread;

public class Client {
    public static void main(String[] args) {
        SubWay subWay=new Meat(new Sauces(new Veggies(
                                            new BrownBread()
                                                            )));
        System.out.println(subWay.getPrice());
        System.out.println(subWay.getDescription());

    }
}
