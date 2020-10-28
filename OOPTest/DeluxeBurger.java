public class DeluxeBurger extends Burger {

    private double price;

    public DeluxeBurger(){
        //must define a super constructor when you extend
        super(0, 0, 0, 0, "wheat", 0);
    }


    public double getPrice() {
        price = super.getPrice() + 2 + 1;

        System.out.println("Your total price is " + price + " with chips and drink.");
        return price;
       
    }
}
