package ourPhoneInharitance;


import java.util.ArrayList;

public class Phone {

    private String model ;

    private ArrayList<Contacts> contactList =  new ArrayList<>();

    public Phone(String model) {

        this.model = model;
    }

    public String getModel() {
        return model;
    }

    void call(String number){
        System.out.println("________________");
        System.out.println( this.model + "Is calling " + number);
    }

    void sendSms(String message, String number){
        System.out.println(this.model+ "Is Sending SMS " + "Sms: " +message + "To: " + number);
    }


    public void takePhoto(){
        System.out.println(this.model + "Is taking photo");
    }



    public ArrayList<Contacts> addcontatcs(String name, String number){
        contactList.add(new Contacts(name,number));
        return contactList;
    }

    public void showContacts(){
        System.out.println(this.model + "Contact List: ");

        for(Contacts singlecontact:contactList){
            System.out.println(singlecontact.name + " - " + singlecontact.number);
        }

    }


    public void showSettings(){
        System.out.println("Sound");
        System.out.println("Display");
        System.out.println("Call");
        System.out.println("Message");

    }





}
