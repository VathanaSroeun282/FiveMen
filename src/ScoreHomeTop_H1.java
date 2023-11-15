import java.util.Arrays;
import java.util.Scanner;

public class ScoreHomeTop_H1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float score1, score2, score3, score4, score5;
        double total, avg;
        System.out.print("Enter Score1 : ");score1 = scan.nextFloat();
        System.out.print("Enter Score2 : ");score2 = scan.nextFloat();
        System.out.print("Enter Score3 : ");score3 = scan.nextFloat();
        System.out.print("Enter Score4 : ");score4 = scan.nextFloat();
        System.out.print("Enter Score5 : ");score5 = scan.nextFloat();
        total = score1 + score2 + score3 + score4 + score5;
        avg = total / 5;
        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);
    }
}
