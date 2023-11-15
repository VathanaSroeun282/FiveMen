import java.util.Scanner;

public class FirstIFElse
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Username        : ");
        String uname = scan.next();//thou//tHoU
        System.out.print("Enter Your Password        : ");
        String pass = scan.next();
        System.out.print("Enter Your Confirm Password: ");
        String cpass = scan.next();

        if(uname.equalsIgnoreCase("Thou")){// uname == "Thou"
            if(pass.equals("12345")){
                if(cpass.equals("12345")){
                    System.out.println("You Login successful!");
                }
                else{
                    System.out.println("Wrong Confirm Password");
                }
            }
            else{
                System.out.println("Invalid Password!");
            }
        }
        else {
            System.out.println("Invalid Username!");
        }
    }
}
