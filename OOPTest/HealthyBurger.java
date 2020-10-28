public class HealthyBurger extends Burger {

    public HealthyBurger(double lettuce, double tomato, double onions, double pickles, String breadRoll, double meat) {
        super(lettuce, tomato, onions, pickles, breadRoll, meat);
        // this.price = price;

    }

    public double getPrice() {
        return super.getPrice();
        // price = price + 0.50 * lettuce+ 0.50 * tomato+ 0.50 * onions+ 0.50 * pickles+
        // 1 * meat;

        // System.out.println("Your total price is " + price);
    }

}
