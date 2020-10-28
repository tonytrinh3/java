// public class Rectangle {
//     private int x;
//     private int y;
//     private int width;
//     private int height;

//     public Rectangle(int x, int y, int width, int height){
//         this.x = x;
//         this.y= y;
//         this.width = width;
//         this.height = height;

//         System.out.println("x: " + x);
//         System.out.println("y: " + y);
//         System.out.println("width: " + width);
//         System.out.println("height: " + height);
//         System.out.println("1st constructor output ");
//     }

//     public Rectangle(int width, int height){
//         // the 0 just zeros out the x and y to nothing and not to be used again 
//         //if you add 1 as default then it will apear 
//         this(0,0,width,height);
//         System.out.println("x: " + x);
//         System.out.println("y: " + y);
//         System.out.println("width: " + width);
//         System.out.println("height: " + height);
//         System.out.println("2nd constructor output ");
//     }

//     public Rectangle(){
//         this(0,0); //this calls the 2nd constructor 
//         //this(0,0,0,0); //this calls the first constructor

//         System.out.println("3rd constructor output ");

//     }

//     public void something(int x, int y, int width, int height){
//         System.out.println("x: " + x);
//         System.out.println("y: " + y);
//         System.out.println("width: " + width);
//         System.out.println("height: " + height);
//         System.out.println("1st constructor output ");
//     }
// }

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y); // here you are calling that you wanna use x and y from Shape
        this.width = width;
        this.height = height;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("width: " + width);
        System.out.println("height: " + height);
        System.out.println("1st constructor output ");
    }

    public Rectangle(int x, int y) {
        this(x, y, 0, 0); // using the constructor above

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("width: " + width);
        System.out.println("height: " + height);
        System.out.println("2nd constructor output ");
    }

    public void runShape(int g, int p){
        System.out.println("g: " + g);
        System.out.println("p: " + p);
    }
}