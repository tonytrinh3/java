public class Cuboid extends Rectangle {

    private double height;



    public Cuboid(double width,double length, double height) {
        super(width,length);
        if (this.height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getheight() {
        return this.height;
    }

    public double getVolume(){
        System.out.print("Volume is: " + super.getArea()*height);
        return super.getArea()*height;
    }
}
