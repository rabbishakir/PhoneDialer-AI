package Customers;

public class Person  {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void eat(){
        System.out.println(this.name + " Is eating");
    }

    void sleep(){
        System.out.println(this.name + " Is sleeping");
    }



}
