package org.example.builderPattern;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {

        /*
        Below is one of the way to achieve the Builder pattern , But there is catch here Still
        we can create the Customer constructor of our own : new Customer(null); that is why it's not feasible
        Please refer to the second Version below :

        CustomerBuilder cbr=new CustomerBuilder();
        customerBuilder.setName("Raj");
        customerBuilder.setAge(25);
        customerBuilder.setLoc("Hyderabad");
        customerBuilder.setEmail("raj@gmail.com");
        customerBuilder.setMembership(true);
        customerBuilder.setPhoneNum(987654321);
        customerBuilder.setSubscription("Subscribed");
        Customer customer=new Customer(customerBuilder);
        System.out.println(customer);
        */

        /*
        Version two:
        Here we are not giving client to create an object of Customer directly by making constructor private
        and also not CustomerBuilder object as well

        we can call the Build() method for creating the object of
         */

        Customer customer=Customer.getBuilder().setName("Raj").setAge(25)
                .setEmail("raj12@gmail.com")
                .setLoc("Hyderabad")
                .setMembership(true)
                .setSubscription("subscribed")
                .setPhoneNum(987654321)
                .Build();

        Customer customer1=Customer.getBuilder().setName("Ram").setAge(22)
                .setEmail("ram12@gmail.com")
                .setLoc("Hyderabad")
                .setMembership(true)
                .setSubscription("subscribed")
                .setPhoneNum(987654321)
                .Build();

        System.out.println(customer);
        System.out.println(customer1);

    }
}
