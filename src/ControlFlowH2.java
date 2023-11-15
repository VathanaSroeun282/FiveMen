import java.text.DecimalFormat;
import java.util.Scanner;

public class ControlFlowH2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#####0.00");
        float oldClock, newClock;
        double totalUse,payment;
        System.out.print("Enter Your OldClock = ");
        oldClock = scan.nextFloat();
        System.out.print("Enter Your NewClock = ");
        newClock = scan.nextFloat();
        totalUse = newClock - oldClock;
        //if(totalUse >= 1 && totalUse <= 10) payment = totalUse * 500;
        //else if(totalUse > 10 && totalUse <= 20) payment = (totalUse - 10) * 550 + 5000;
        //else if(totalUse > 20 && totalUse <= 30) payment = (totalUse - 20) * 600 + 10500;
        //else if(totalUse > 30 && totalUse <= 40) payment = (totalUse - 30) * 650 + 16500;
        //else if(totalUse > 40 && totalUse <= 50) payment = (totalUse - 40) * 700 + 23000;
        //else if(totalUse > 50 && totalUse <= 60) payment = (totalUse - 50) * 750 + 30000;
        //else payment = (totalUse - 60) * 800 + 37500;
        /*Using Ternary operator
        * payment = (totalUse >= 1 && total <= 10) ? (totalUse * 500) : ((totalUse > 10 && total <= 20) ? ((totalUse - 10) * 550 + 5000) : ((totalUse > 20 && total <= 30) ? ((totalUse - 20) * 600 + 10500) : ((totalUse > 30 && total <= 40) ? ((totalUse - 30) * 650 + 16500) : ((totalUse > 40 && total <= 50) ? ((totalUse - 40) * 700 + 23000) : ((totalUse > 50 && total <= 60) ? ((totalUse - 50) * 750 + 30000) : ((totalUse - 60) * 800 + 37500))))));
        */
        payment = (totalUse >= 1 && totalUse <= 10) ? (totalUse * 500) : ((totalUse > 10 && totalUse <= 20) ? ((totalUse - 10) * 550 + 5000) : ((totalUse > 20 && totalUse <= 30) ? ((totalUse - 20) * 600 + 10500) : ((totalUse > 30 && totalUse <= 40) ? ((totalUse - 30) * 650 + 16500) : ((totalUse > 40 && totalUse <= 50) ? ((totalUse - 40) * 700 + 23000) : ((totalUse > 50 && totalUse <= 60) ? ((totalUse - 50) * 750 + 30000) : ((totalUse - 60) * 800 + 37500))))));

        System.out.println("Your TotalUse  = " + totalUse);
        System.out.println("==> Payment    = " + payment + "R or " + df.format((payment/4150)) + "$");
    }
}
