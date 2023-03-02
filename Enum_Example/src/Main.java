public class Main {
    public static void main(String[] args) {
        final String message = "Now is ";
        Season season = Season.WINTER;
        String output = switch (season) {
            case AUTUMN -> message + Season.AUTUMN.getValue();
            case WINTER -> message + Season.WINTER.getValue();
            case SPRING -> message + Season.SPRING.getValue();
            case SUMMER -> message + Season.SUMMER.getValue();
        };

        System.out.println(output);
    }
}