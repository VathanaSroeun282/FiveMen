import  javax.swing.*;
public class UserInputDialog {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Input Dialog Box first!");
        int x, y, result;
        x = Integer.parseInt(JOptionPane.showInputDialog(frame,"Input X :"));
        y = Integer.parseInt(JOptionPane.showInputDialog(frame,"Input Y :"));
        result = x + y;
        JOptionPane.showMessageDialog(null, "Result "+x+" + "+y+ " = " + result);
    }
}