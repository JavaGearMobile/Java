import javax.swing.*;

class Greeting {
    private int first;
    private int second;

    void setFirst(int value) {
        first = value;
    }

    void setSecond(int value) {
        second = value;
    }

    public int sum() {
        return first + second;
    }

    public int multiply() {
        return first * second;
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

        greeting.setFirst(values[0]);
        greeting.setSecond(values[1]);

        message = String.format("Sum of values is %s", greeting.sum());
        JOptionPane.showMessageDialog(null, message);

        message = String.format("Multiply of values is %s", greeting.multiply());
        JOptionPane.showMessageDialog(null, message);
    }
}