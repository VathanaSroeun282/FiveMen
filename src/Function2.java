import java.util.Scanner;

public class Function2 {
    static int sum (int a, int b){
        return a + b;
    }

    static void outputSum(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of A : ");
        int a = scan.nextInt();
        System.out.print("Enter Number of B : ");
        int b = scan.nextInt();

        System.out.println("Sum of A + B = " + sum(a, b));
    }
    public static void main(String[] args) {
        outputSum();
    }
}