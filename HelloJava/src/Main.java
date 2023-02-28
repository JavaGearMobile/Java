import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name, surName;
        int yearBorn, yearNow;

        System.out.print("Your name?: ");
        name = input.nextLine();

        System.out.print("Your surname?: ");
        surName = input.nextLine();

        System.out.print("What is your born year?: ");
        yearBorn = input.nextInt();

        System.out.print("What year now?: ");
        yearNow = input.nextInt();

        // Greeting
        System.out.println("Hello " + name + " " + surName + "!");
        System.out.println("You are " + (yearNow - yearBorn) + " old years");
    }
}