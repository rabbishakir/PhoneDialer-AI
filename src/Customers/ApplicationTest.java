package Customers;

public class ApplicationTest {
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor("Robin");
        doctor1.giveHealthLesson();

        Singer singer1 = new Singer("Shakil");
        singer1.singAsong();

        doctor1.getDrsSmartPhone().showSettings();
        doctor1.getDrsSmartPhone().showContacts();

    }
}
