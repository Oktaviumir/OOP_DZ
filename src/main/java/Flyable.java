public interface Flyable {
    void fly();
    default double getFlySpeed(){
        return 25;
    };
}
