import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Player tony = new Player ("tony", 10,15);
        System.out.println(tony.toString());
        saveObject(tony);

        tony.setHitPoint(8); // change hitpoint from 10 to 8
        System.out.println(tony);
        tony.setWeapon("God Fear"); //change weapon name from shotgun to god fear
        saveObject(tony);
//        loadObject(tony);
        System.out.println(tony);

        //can be saveable or monster class instance
        Saveable werewolf = new Monster("Werewolf", 20,40);
        //werewolf.getStrength(); // if you label the instance by the interface, then you can't use the method from monster class
        System.out.println("Strength = " + ((Monster) werewolf).getStrength()); // you do this to still get the method of monster class
        System.out.println(werewolf);
        saveObject(werewolf);


    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


    public static void saveObject(Saveable objectToSave){
        //write() method already has the new List built in
        for (int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(Saveable objectToLoad){
        ArrayList<String> values = readValues(); //instance
        objectToLoad.read(values); //the player class
    }
}
