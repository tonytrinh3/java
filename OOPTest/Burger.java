public class Burger {
    private double lettuce;
    private double tomato;
    private double onions;
    private double pickles;
    private String breadRoll;
    private double meat;

    private double price = 5; // price of base burger

    public Burger(double lettuce, double tomato, double onions, double pickles, String breadRoll, double meat) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.onions = onions;
        this.pickles = pickles;
        this.breadRoll = breadRoll;
        this.meat = meat;
    }

    public double getPrice() {
      

        price = price + 0.50 * lettuce+ 0.50 * tomato+ 0.50 * onions+ 0.50 * pickles+ 1 * meat;
       System.out.println("Your total price is " + price);
       return price;
    }

    public void getBreadRoll() {
        System.out.println("You have chosen " + this.breadRoll.);
    }

}
