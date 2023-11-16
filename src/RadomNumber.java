import java.util.Random;

public class RadomNumber {
    public static void main(String[] args){
        Random ren = new Random();
        System.out.println("This is my age : " + ren.nextInt(30));


        int ran_number = ren.nextInt(50);
        System.out.println("This is my random number : " + ran_number);
    }
}
