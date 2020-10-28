public class Main {

    public static void main(String[] args){
        Telephone tonyPhone; //the instance of Telephone interface
        //Telephone tonyPhone = new DeskPhone

        //DeskPhone tonyPhone is ok as well but you use Telephone tonyPhone
       // provided you use the appropriate class that has
       //implemented the interface in a class, in a case rather, it was desk phone.

        //if you do DeskPhone tonyPhone then you can't use the same instance name for new MobilePhone
        //but since you call the instance with the interface and both deskphone and mobilephone use the same interface
        //then you can use the same instance name
        tonyPhone = new DeskPhone(123456);
        tonyPhone.powerOn();
        tonyPhone.callPhone(123456);
        tonyPhone.answer();


        tonyPhone = new MobilePhone(234567);
        tonyPhone.powerOn();
        tonyPhone.callPhone(234567);
        tonyPhone.answer();

    }
}
