package ourPhoneInharitance;


import java.util.ArrayList;

public class Phone {

    private String model ;

    private ArrayList<Contacts> contactList =  new ArrayList<>();

    public Phone(String model) {
        this.model = model;
    }

    void call(String number){
        System.out.println( this.model + "Is calling " + number);
    }

    void sendSms(String message, String number){
        System.out.println(this.model+ "Is Sending SMS " + "Sms: " +message + "To: " + number);
    }

    void showSettings(){
        System.out.println("Settings for " + this.model );
        System.out.println("------------------------------");
        System.out.println("Speaker");
        System.out.println("Display");
        System.out.println("Microphone");
        System.out.println("Call");
        System.out.println("Group Sms");
        System.out.println("Contacts");
    }

    public ArrayList<Contacts> addcontatcs(String name, String age){
        contactList.add(new Contacts(name,age));
        return contactList;
    }

    public void showContacts(){
        System.out.println(this.model + "Contact List: ");
        System.out.println(contactList.size());

        for(Contacts singlecontact:contactList){
            System.out.println(singlecontact.name);
            System.out.println(singlecontact.number);
        }

    }





}
