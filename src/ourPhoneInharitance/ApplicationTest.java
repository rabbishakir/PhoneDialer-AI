package ourPhoneInharitance;

public class ApplicationTest {

    public static void main(String[] args) {

        // made object of smart and nonsmart phone
        // Note: Interview question (iphone samsung and nokia are reference variable)

        SmartPhone iphone = new SmartPhone("iPhone 14 Pro Max ", true,true);
        SmartPhone samsung = new SmartPhone("Galaxy S12 ", false,false);
        NonSmartPhone nokia = new NonSmartPhone("Nokia 3310 ");


        //functionality of iPhone
        iphone.call("123 456 8888");
        iphone.showSettings();
        iphone.sendSms("I bought a new Iphone 14 pro max ", "123 456 8888");
        iphone.takePhoto("B&W");

        // functionality of Android phone
        samsung.call("987 654 1111");
        samsung.showSettings();
        samsung.takePhoto();
        samsung.showContacts();



        //functionality of nonSmart  Phone
        nokia.call("654 654 5555");
        nokia.showSettings();
        nokia.addcontatcs("Azmar","455 555 6656");
        nokia.addcontatcs("Shohrah","452 222 2323");
        nokia.showContacts();
        nokia.takePhoto();

    }

}
