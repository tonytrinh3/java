public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly(); // calls what is already existing in the interface
        System.out.println("I'm not very good at that, can I got for a swim instead?");
    }
}
