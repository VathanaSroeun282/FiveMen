import java.util.Scanner;

public class ControlFlowH1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float scoreMaths, scorePhy, scoreISAD, scoreNET, scoreAnalys;
        double total,avg;
        char grade = 'x';
        boolean status = true;
        System.out.print("Enter Maths' score     : ");
        scoreMaths = scan.nextFloat();
        System.out.print("Enter Physics' score   : ");
        scorePhy   = scan.nextFloat();
        System.out.print("Enter ISAD's score     : ");
        scoreISAD  = scan.nextFloat();
        System.out.print("Enter .NET' score      : ");
        scoreNET   = scan.nextFloat();
        System.out.print("Enter Analysis's score : ");
        scoreAnalys= scan.nextFloat();

        total = scoreMaths + scoreISAD + scoreAnalys + scorePhy + scoreNET;
        avg   = total / 5;// found average
        //grade = (avg >= 0 && avg < 50)?'F':((avg >= 50 && avg <= 60)?'E':((avg > 60 && avg <= 70)?'D':((avg > 70 && avg <= 80)?'C':((avg > 80 && avg <= 90)?'B':((avg > 90 && avg <= 100)?'A':'X'))))); // ternary operator
        //if(grade == 'F') status =false;
        if(avg >= 0 && avg < 50)       {grade = 'F'; status = false;}
        else if(avg >= 50 && avg <= 60)  grade = 'E';
        else if(avg > 60 && avg <= 70)  grade = 'D';
        else if(avg > 70 && avg <= 80)  grade = 'C';
        else if(avg > 80 && avg <= 90)  grade = 'B';
        else if(avg > 90 && avg <= 100) grade = 'A';
        String check = status ? "Pass" : "Fall";
        String text = "Your Maths score = " + scoreMaths + "\nYour Physics score = " + scorePhy + "\nYour ISAD score = " + scoreISAD + "\nYour Analysis = " + scoreAnalys + "\nYour .NET score = " + scoreNET;
        System.out.println(text);
        System.out.println("Your Total score = " + total);
        System.out.println("Your Average     = " + avg);
        System.out.println("Your Status      = " + check);
        System.out.println("Your Grade       = " + grade);
    }
}
