import javax.swing.*;

public class Function1 {
    //none return function
    static void output(){
        System.out.println("Hello, world!");
    }

    //return function
    static int sum(){
        return 100 + 300;
    }
    public static void main(String[] args) {
        output();//called none return function
        System.out.println("Sum = " + sum());//called return function

        //show in messageDialog BOX
        JOptionPane.showMessageDialog(null,"Sum = " + sum());
    }
}
