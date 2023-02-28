import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int userAge, yearBorn, yearNow;

        yearNow = Integer.parseInt(JOptionPane.showInputDialog("What is year now?"));
        yearBorn = Integer.parseInt(JOptionPane.showInputDialog("What is your born year?"));
        userAge = yearNow - yearBorn;

        JOptionPane.showMessageDialog(null, "You are " + userAge + " old years!");
    }
}