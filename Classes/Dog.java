public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    
    //constructor 
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //since we know that all dog got a brain and a body, so we're not going to force the programmer who's creating the Dog class to have to define those 
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        //no error will occure if you don't include super.eat()
        super.eat(); //running the eat method from Animal
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        //only execute move() method from the super class - Animal class where you extended from 
        super.move(5);//calling this stays loyal to the original method of Animal.move() and doesn't get affected by the new move() method within the class
    
    }

    public void run(){
        System.out.println("Dog.run() called");
        //when you call move() by itself, it is open to be override by move() method defined again within the Dog class
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }



    @Override
    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
