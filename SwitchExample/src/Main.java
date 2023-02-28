import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final int min = 1;
        final int max = 4;
        int userData;
        String userInput;

        userInput = JOptionPane.showInputDialog(String.format("Enter number from %s to %d", min, max));
        userData = Integer.parseInt(userInput);

        if(userData <= max & userData >= min) {
            JOptionPane.showMessageDialog(null, String.format("You enter number %s", userData));
        } else {
            JOptionPane.showMessageDialog(null, "You enter wrong number!");
        }
    }
}