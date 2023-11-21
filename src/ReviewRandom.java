import java.util.Random;

public class ReviewRandom {
    public static void main(String[] args) {
        //Create Object for Random
        Random newRan = new Random();

        //Assign value to newNumber that it gets from random number (0 to 5)
        int newNumber = newRan.nextInt(0,5);

        //output value of newNumber
        System.out.println("Random Number is : " + newNumber);
    }
}
