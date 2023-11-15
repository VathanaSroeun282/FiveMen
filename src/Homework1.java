import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int id;
        String name;
        String Sex;
        String Address;
        //Input
        System.out.print("Enter Your Name : ");
        name = Scan.next();
        System.out.print("Enter Your ID   : ");
        id   = Scan.nextInt();
        System.out.print("Enter Your Sex : ");
        Sex = Scan.next();
        System.out.print("Enter Your Address : ");
        Address = Scan.next();

        //Output
        System.out.println("Your Name is : " + name);
        System.out.println("Your ID   is : " + id);
        System.out.println("Your Sex  is : " + Sex);
        System.out.println("Your Address : " + Address);
    }
}
