package ourPhoneInharitance;

public class SmartPhone extends Phone {

    private boolean hasNfc = false;
    private boolean isPaymentEnable = false;

    public SmartPhone(String model, boolean hasNfc,boolean isPaymentEnable) {
        super(model);
        this.hasNfc = hasNfc;
        this.isPaymentEnable = isPaymentEnable;
    }


    @Override
    public void showSettings(){
        super.showSettings();
        System.out.println("Bluetooth");
        System.out.println("Internet");
        System.out.println("Touchscreen");

        if (this.hasNfc == true){
            System.out.println("NFC");
        }
        if (this.isPaymentEnable==true) {
            System.out.println("Payment");
        }

    }



}
