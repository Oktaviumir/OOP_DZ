public interface Goable {
    public static final String type = "Goable"; //не обязательно, стоит по умолчанию

    void run();

    default double getRunSpeed() {
        return 5.5;
    }
}