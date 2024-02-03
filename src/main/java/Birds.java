import java.time.LocalDate;

public class Birds extends Animal implements Goable, Swim, Fly, ToGo {
    private Birds() {
        super();
    }

    public Birds(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public void toGo() {
        System.out.println("отлично ходят");
    }

    @Override
    public void swim() {
        System.out.println("некоторые птицы умеют плавать");
    }

    @Override
    public void fly() {
        System.out.println("умеют летать (кроме некоторых))");
    }

    @Override
    public void run() {
        System.out.print("Птица летает со скоростью : ");
    }

    @Override
    public double getRunSpeed() {
        return 20;
    }
}