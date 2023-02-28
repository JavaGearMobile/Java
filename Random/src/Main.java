import javax.swing.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random(System.currentTimeMillis());

        final int MIN = 1;
        final int MAX = 10;
        final int SECRET_NUMBER = MIN + rnd.nextInt(MAX);
        final int BREAK_NUMBER = 99;
        int userData;
        int userCounter = 0;

        do {
            String userInput = JOptionPane.showInputDialog(null, String.format("Enter integer number from %s to %d", MIN, MAX));
            userData = Integer.parseInt(userInput);

            if (userData == BREAK_NUMBER) {
                JOptionPane.showMessageDialog(null, "Game over! Good buy!");
                break;
            } else {
                userCounter++;
                final String message = (userData != SECRET_NUMBER) ? "You are wrong! You enter wrong number" : String.format("You win! Your attempts are: %s", userCounter);
                JOptionPane.showMessageDialog(null, message);
            }

        } while (userData != SECRET_NUMBER);
    }
}