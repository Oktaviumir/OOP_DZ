import java.time.LocalDate;

public class Fish extends Animal implements Goable, Swim {
    public Fish() {
        super();
    }

    public Fish(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }


    @Override
    public void swim() {
        System.out.println("Умеют плавать");
    }

    @Override
    public void run() {
        System.out.print("Рыба плывет со скоростью: ");
    }

    @Override
    public double getRunSpeed() {
        return 15;
    }
}