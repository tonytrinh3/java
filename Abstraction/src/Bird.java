
//if this is no abstract class then you don't need to abstract method fly and just call it normally
public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    public abstract void fly();
    //we could make this a normal method but we want to keep the Bird a generic class to be
    // extended to specific types of bird
//    {
//        System.out.println("Flying from branch to branch");
//    }
}
