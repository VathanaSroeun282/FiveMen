import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ifElseif {
    public static void main(String[] args) {
        int Code;
        String Name;
        int Qty;
        double price, total, discount, pay;
        DecimalFormat FrM = new DecimalFormat("####0.00");//Format 00000.00  Define number behind point(.) 2block
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Code = ");
        Code = scan.nextInt();
        System.out.print("Input Name = ");
        Name = scan.next();
        System.out.print("Input Quantity = ");
        Qty  = scan.nextInt();
        System.out.print("Input Price    = ");
        price = scan.nextDouble();

        total = Qty * price;

        if(total >= 1 && total < 10) discount = total * 0.1;
        else if(total >= 10 && total < 20) discount = total * 0.2;
        else if(total >= 20 && total < 30) discount = total * 0.3;
        else if(total >= 30 && total < 40) discount = total * 0.4;
        else if(total >= 40 && total < 50) discount = total * 0.5;
        else discount = total * 0.6;

        pay = total - discount;
        System.out.println("Total Dollar = " + FrM.format(total));
        System.out.println("Discount     = " + FrM.format(discount));
        System.out.println("Payment      = " + FrM.format(pay));
    }
}
