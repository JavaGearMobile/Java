class MyOverload {
    private int number;
    private String string;

    void set(int value) {
        number = value;
    }

    void set(String value) {
        string = value;
    }

    void set(int first, String second) {
        set(first);
        set(second);
    }

    void set() {
        set(3, "Hello");
    }

    void show() {
        System.out.println("First field: " + number);
        System.out.println("Second field: " + string);
    }
}

public class Main {
    public static void main(String[] args) {
        MyOverload myOverloadFirst = new MyOverload();
        MyOverload myOverloadSecond = new MyOverload();

        myOverloadFirst.set(10);
        myOverloadFirst.set("Welcome");

        myOverloadSecond.set();

        System.out.println("First object");
        myOverloadFirst.show();

        System.out.println("Second object");
        myOverloadSecond.show();
    }
}