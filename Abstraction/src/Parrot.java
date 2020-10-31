//you can only call class normally from main. it cannot be abstract
//abstract means you will extend that class further to a normal class and call on its method to override
//i guesss you do this to limit what method should be used with the abstract class
public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    //you dont need to override eat and breath bc that is already being overridden in Bird class anymore
    @Override
    public void fly() {
        System.out.println("Flying from branch to branch");
    }
}
