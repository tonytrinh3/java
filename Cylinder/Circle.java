public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){

        if (this.radius < 0){
            this.radius = 0;
        }

        return this.radius;
    }

    public double getArea(){
        System.out.println("Area "+radius*radius*Math.PI);
        return radius*radius*Math.PI;
    }


}
