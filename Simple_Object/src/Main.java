import javax.swing.*;

class Greeting {
    int first;
    int second;

    void set(int primo, int secondo) {
        first = primo;
        second = secondo;
    }

    int sum(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        String input;
        String message;
        int [] values = new int[2];

        input = JOptionPane.showInputDialog(null, "Enter first value");
        values[0] = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null, "Enter second value");
        values[1] = Integer.parseInt(input);

        greeting.set(values[0], values[1]);

        message = String.format("Sum of values is %s", greeting.sum(values[0], values[1]));
        JOptionPane.showMessageDialog(null, message);

        message = String.format("Multiply of values is %s", greeting.multiply(values[0], values[1]));
        JOptionPane.showMessageDialog(null, message);
    }
}