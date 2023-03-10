package ourPhone;

public class Phone {


    // these are phones properties

    private String brand = "Apple";
    private String model = "Iphone 11 ";
    private String color = "Silver";
    private String screenSize = "6.7 Inch";
    private Boolean hasCamera = true;
    private Boolean hasTouch  = true;
    private Boolean hasNFC  = true;


      public Phone(String model, Boolean hasCamera){
         this.model = model;
         this.hasCamera = hasCamera;
      }


    // Getters and setters methods

    //    public String getModel() {
    //        return model;
    //    }
    //    public void setModel(String model) {
    //        this.model = model;
    //    }


    // these are phones methods/functions

    void call(String number){
        System.out.println( this.model + "Is calling " + number);
    }

    void sendSms(String message, String number){
        System.out.println(this.model+ "Is Sending SMS " + "Sms: " +message + "To: " + number);
    }

    void showSettings(){
        System.out.println("Settings for  " + this.model);
    }

    void takePicture(){
          if(hasCamera==true){
              System.out.println(this.model + "Is Taking Pictures ");
          }else{
              System.out.println(this.model + "Can not take Pictures ");
          }
    }

}
