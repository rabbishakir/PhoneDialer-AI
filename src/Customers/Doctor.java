package Customers;

import ourPhoneInharitance.SmartPhone;

public class Doctor extends Person {
    public Doctor(String name) {
        super(name);
    }
    public void giveHealthLesson(){
        System.out.println(super.getName() + " Advise: Eat less curb");
    }
    public SmartPhone drsSmartPhone = new SmartPhone("iPhone 13", true, true);
    public SmartPhone getDrsSmartPhone() {
        return drsSmartPhone;
    }

}
