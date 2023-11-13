import java.util.Scanner;
import javax.swing.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Enter Your Name : ");
        name = input.next(); // cin>>name;

        System.out.println("Enter Your Age : ");
        age = input.nextInt(); // cin>>age;

        System.out.println("Your Name is : " + name);
        System.out.println("Your Age  is : " + age );
        JOptionPane.showMessageDialog(null,"Your Name is"+name+"\nYour Age  is : " + age);
    }
}
