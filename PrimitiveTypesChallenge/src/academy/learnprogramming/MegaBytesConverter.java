package academy.learnprogramming;

public class MegaBytesConverter {

    public static void main(String[] args){
        // double som = 2500/1024.0;
        // System.out.println(som);
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes <0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + kiloBytes/1024 + " MB and " + kiloBytes%1024 + " KB");
        }
    }
}
