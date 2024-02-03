import java.time.LocalDate;

public class Animal {
    private String name;
    private Illness illness;
    private String ownername;
    private LocalDate birthday;

    public Animal(){
    }

    public Animal(String name, Illness illness, String ownername, LocalDate birthday){
        this.name = name;
        this.illness = illness;
        this.ownername = ownername;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getOwnername() {
        return ownername;
    }

    public Illness getIllness() {
        return illness;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    private void toWakeUp(){
        System.out.println(name + " встал");
    }

    private void eat() {
        System.out.println(name + " поел");
    }

    private void play() {
        System.out.println(name + " поиграл");
    }

    private void sleep() {
        System.out.println(name + " пошел спать");
    }

    public void liveCircle(){
        toWakeUp();
        eat();
        play();
        sleep();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", illness=" + illness +
                ", ownername='" + ownername + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
