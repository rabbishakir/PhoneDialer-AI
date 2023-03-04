package ourPhoneInharitance;

public class ApplicationTestNew {

    public static void main(String[] args) {

        SmartPhone iphone = new SmartPhone("iPhone 14 Pro Max ", true,true);
        SmartPhone samsung = new SmartPhone("Galaxy S12 ", false,false);
        NonSmartPhone nokia = new NonSmartPhone("Nokia 3310 ");

        iphone.call("123 456 8888");
        iphone.showSettings();
        iphone.sendSms("I bought a new Iphone 14 pro max ", "123 456 8888");

        samsung.call("987 654 1111");
        samsung.showSettings();

        nokia.call("654 654 5555");
        nokia.showSettings();
        nokia.addcontatcs("rabbi","45");
        nokia.addcontatcs("rabbi2","452");
        nokia.showContacts();


//        nokia.addcontatcs("Ranbir");
//        nokia.addcontatcs("Rahman");
//        nokia.showContacts();

    }

}
