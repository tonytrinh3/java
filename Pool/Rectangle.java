public class Rectangle {

    private double width;
    private double length;



    public Rectangle(double width, double length){
        if (this.width <0){
            this.width = 0;
        } else {
            this.width = width;
        }

        if (this.length <0){
            this.length = 0;
        } else {
            this.length = length;
        }
  
    }

    public double getWidth() {
        return this.width;
    }

    public double getlength() {
        return this.length;
    }
    

    public double getArea(){
        System.out.print("Area is: " + width*length);
        return width*length;
    }

}
