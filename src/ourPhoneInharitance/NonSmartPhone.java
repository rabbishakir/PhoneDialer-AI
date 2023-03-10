package ourPhoneInharitance;

public class NonSmartPhone extends Phone {

    public NonSmartPhone(String model) {
        super(model);
    }

    @Override
    public void takePhoto() {
        System.out.println("Camera: " + "Sorry I dont have a camera module");
    }
}
