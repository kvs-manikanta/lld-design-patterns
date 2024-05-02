package org.example.builderPattern;

public class Customer {
    String name;
    int age;
    String email;
    int phoneNum;
    String loc;
    boolean membership;
    String subscription;


    //passing the customerBuilder object for validation

    private Customer(CustomerBuilder customerBuilder)
    {
        //Applying validation on data before object creation
        //Now validation is passing to the Builder class

        /*
        if(customerBuilder.age<18)
        {
            throw new RuntimeException("Customer is not a valid one");
        }
        if(!customerBuilder.membership)
        {
            throw new RuntimeException("Customer is not a valid one");
        }
        */
        this.name=customerBuilder.getName();
        this.age=customerBuilder.getAge();
        this.membership= customerBuilder.isMembership();
        this.loc= customerBuilder.getLoc();
        this.email= customerBuilder.getEmail();
        this.phoneNum= customerBuilder.getPhoneNum();
        this.subscription=customerBuilder.getSubscription();
    }

    public static CustomerBuilder getBuilder()
    {
        return new CustomerBuilder();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNum=" + phoneNum +
                ", loc='" + loc + '\'' +
                ", membership=" + membership +
                ", subscription='" + subscription + '\'' +
                '}';
    }

    public static class CustomerBuilder {
        String name;
        int age;
        String email;
        int phoneNum;
        String loc;
        boolean membership;
        String subscription;


        public String getName() {
            return name;
        }

        public CustomerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public CustomerBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public CustomerBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public int getPhoneNum() {
            return phoneNum;
        }

        public CustomerBuilder setPhoneNum(int phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }

        public String getLoc() {
            return loc;
        }

        public CustomerBuilder setLoc(String loc) {
            this.loc = loc;
            return this;
        }

        public boolean isMembership() {
            return membership;
        }

        public CustomerBuilder setMembership(boolean membership) {
            this.membership = membership;
            return this;
        }

        public String getSubscription() {
            return subscription;
        }

        public CustomerBuilder setSubscription(String subscription) {
            this.subscription = subscription;
            return this;
        }

        public Customer Build()
        {
            //validating the data before object creation of Customer
            if(this.age<18)
            {
                throw new RuntimeException("Customer is not a valid one");
            }
            if(!this.membership)
            {
                throw new RuntimeException("Customer is not a valid one");
            }

            return new Customer(this);
        }
    }

}
