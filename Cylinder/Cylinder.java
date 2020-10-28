public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getHeight(){
        if (this.height < 0){
            this.height = 0;
        }

        return this.height;
    }

    public double getVolume(){
        System.out.println("Volume: " + super.getArea()*height);
        return super.getArea()*height;
    }
}
