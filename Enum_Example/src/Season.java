public enum Season {
    WINTER("зима"), SPRING("весна"), SUMMER("лето"), AUTUMN("осень");

    Season(String season) {
        this.season = season;
    }

    private String season;

    public String getValue() {
        return season;
    }

    public String toString() {
        return season;
    }
}
