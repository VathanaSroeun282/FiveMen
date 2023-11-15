import java.util.Date;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Code;
        String Name;
        int qty;
        float price;

        double totalr; float totald;

        System.out.print("Enter Code     : ");
        Code = scan.nextInt();
        System.out.print("Enter Name of Product : ");
        Name = scan.next();
        System.out.print("Enter Quantity : ");
        qty = scan.nextInt();
        System.out.print("Enter Price    : ");
        price = scan.nextFloat();

        totald = qty * price;
        totalr = totald * 4100;
        System.out.print("Code = " + Code + "\nName = " + Name + "\nQTY = " + qty + "\nPrice = " + price + "\nTotal Dollar =  " + totald + "\nTotal Riel = " + totalr);
    }
}
