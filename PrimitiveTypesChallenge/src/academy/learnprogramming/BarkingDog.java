package academy.learnprogramming;
import java.util.Scanner; 

public class BarkingDog {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();//you need this so each question is asked

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2018 - yearOfBirth;


        System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        scanner.close();
    }

    public static void shouldWakeUp(boolean barking, int hourOfDay){

    }
}
