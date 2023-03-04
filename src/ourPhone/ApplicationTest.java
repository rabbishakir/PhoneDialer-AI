package ourPhone;

public class ApplicationTest {
    public static void main(String[] args) {
        System.out.println("This is the class which is runnable and we will test our application from this class");

        // maing an object of the phone class because we want to make new phones

        Phone iphone = new Phone("iPhone 11 ", true);
        iphone.call("654321");
        iphone.sendSms("Hi Sam, I am learning Java. ","789789");
        iphone.takePicture();

        Phone samsung = new Phone("Samaung S8 ", true);

        // samsung.setModel("Samsung 705ST");
        // System.out.println("Using getMethod " + samsung.getModel());

        samsung.call("123456");
        samsung.sendSms("Hi Monika, I am going to Friends Place. ", "6565465");
        samsung.takePicture();

        Phone nokia = new Phone("Nokia 3310 ", false);
        nokia.call("696988");
        nokia.sendSms("Hi This is my new Nokia phone","7589658");
        nokia.takePicture();


    }
}

