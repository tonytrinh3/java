
//if this is no abstract class then you don't need to abstract method fly and just call it normally
public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        //getName() method is from Animal
        System.out.println(getName() + " is pecking.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

//les 130
//    public abstract void fly();
    //we could make this a normal method but we want to keep the Bird a generic class to be
    // extended to specific types of bird
//    {
//        System.out.println("Flying from branch to branch");
//    }


    //les 131
    //so you do an interface in order to have the fly method available for other flying animals that arent bird
    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
