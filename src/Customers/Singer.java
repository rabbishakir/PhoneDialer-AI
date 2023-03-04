package Customers;

public class Singer extends Person {

    public Singer(String name) {
        super(name);
    }

    void singAsong(){
        System.out.println(super.getName() + " is Singing: Its My Life");
    }
}
