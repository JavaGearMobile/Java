public class Simple {
    public int someNumber;
    public String someMessage;

    Simple() {
        someNumber = 10;
        someMessage = "message";
        System.out.println(someNumber + " -- " + someMessage);
    }

    Simple(int number, String string) {
        someNumber = number;
        someMessage = string;
        System.out.println(someNumber + " -- " + someMessage);
    }
}
