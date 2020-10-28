package academy.learnprogramming;





public class SpeedConverter {

    public static void main(String[] args){

        double[] arr = {1.5,10.25,-5.6,25.42,75.114};

        for( int i = 0; i<arr.length; i++ ){
            printConversion(arr[i]);
        }

    }




    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        } else {

            long ans = Math.round(kilometersPerHour/1.609);
            return ans;
        }
    }

    public static void printConversion (double kilometersPerHour){

        if ( toMilesPerHour(kilometersPerHour) < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }

    }
    
}
