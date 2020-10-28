package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        displayHighScorePosition("Tony", 8);
        int[] array = {1500,900,400,50};
        for (int i =0; i < array.length; i++){
            System.out.println(calculateHighScorePosition(array[i]));
        }
    }

    // if we want to return something - we need to change from void to int or
    // whatever
    public static void calculateScore() {

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {

        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }

    }

}
