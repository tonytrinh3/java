public class BurgerMain{
    public static void main(String[] args){
        Burger newOrder = new Burger(1,1,1,1,"wheat",2);
        HealthyBurger newOrder2 = new HealthyBurger(2,2,1,1,"brown rye",2);
        DeluxeBurger newOrder3 = new DeluxeBurger();
        newOrder.getPrice();
        newOrder.getBreadRoll();
        newOrder2.getPrice();
        newOrder2.getBreadRoll();
        newOrder3.getPrice();
    }
}