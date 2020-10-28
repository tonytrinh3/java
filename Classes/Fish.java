public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public int getGills() {
        return this.gills;
    }

    public int getEyes() {
        return this.eyes;
    }

    public int getFins() {
        return this.fins;
    }

    private void rest(){

    }
    private void moveMuscles(){
        
    }
    private void moveBackFind(){
        
    }
    private void swim(int speed){
        moveMuscles();
        moveBackFind();
        super.move(speed);
    }

}
