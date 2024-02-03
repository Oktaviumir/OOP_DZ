import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Birds birds = new Birds("Чижик", new Illness("Сломанное крыло"), "Петр", LocalDate.of(2010, 2, 12));
        Cat cat = new Cat("Сид", new Illness("Соня"), "Максим", LocalDate.of(2021, 5, 15));
        Dog dog = new Dog("Луна", new Illness("Стресс"), "Таня", LocalDate.of(2023, 12, 21));
        Fish fish = new Fish("Немо", new Illness("Нет, наблюдается"), "Нина", LocalDate.of(2019, 7, 2));
        Doctor zooPsiholog = new ZooPsiholog("Сергей", "Михайлов", "Зоо психолог");
        Doctor terapevt = new Terapevt("Григорий", "Сидоров", "Терапевт");
        Nurse nurseOne = new Nurse("Анна", "Сурикова");
        Nurse nurseTwo = new Nurse("Татьяна", "Федорова");

        Scanner scan = new Scanner(System.in);
        System.out.println("Выберети животное, по которому хотите посмотреть информацию: " +
                "\n1 - Птица\n2 - Кот\n3 - Собака\n4 - Рыба\n5 - Все пациенты\n0 - выход");
        System.out.print(": ");
        int input = scan.nextInt();
        while (!(input == 1 || input == 2 || input == 3 || input == 4 || input == 5 || input == 0)) {
            System.out.println("Не верный ввод, введите еще раз.");
            System.out.println("Выберети животное, по которому хотите посмотреть информацию: " +
                    "\n1 - Птица\n2 - Кот\n3 - Собака\n4 - Рыба\n5 - Все пациенты\n0 - выход");
            System.out.print(": ");
            input = scan.nextInt();
        }

        if (input == 1) {
            System.out.println("Имя птицы: " + birds.getName());
            System.out.println("Болезнь: " + birds.getIllness());
            System.out.println("Владелец: " + birds.getOwnername());
            System.out.println("Дата рождения: " + birds.getBirthday());
            System.out.println("Жизненный цикл: ");
            birds.liveCircle();
            birds.toGo();
            birds.fly();
            birds.swim();
            birds.run();
            System.out.println(birds.getRunSpeed());
            System.out.print("Лечит: ");
            System.out.println("Медсестра : " + nurseOne.getName() + " " + nurseOne.getSurName());
            return;
        }

        if (input == 2) {
            System.out.println("Имя кота: " + cat.getName());
            System.out.println("Болезнь: " + cat.getIllness());
            System.out.println("Владелец: " + cat.getOwnername());
            System.out.println("Дата рождения: " + cat.getBirthday());
            System.out.println("Жизненный цикл: ");
            cat.toGo();
            cat.swim();
            cat.run();
            System.out.println(cat.getRunSpeed());
            System.out.println("Врач: " + zooPsiholog.getName() + " " + zooPsiholog.getSurName() + " "
                    + zooPsiholog.getSpetialisation());
            System.out.println("Медсестра : " + nurseTwo.getName() + " " + nurseTwo.getSurName());
            return;
        }

        if (input == 3) {
            System.out.println("Имя собаки: " + dog.getName());
            System.out.println("Болезнь: " + dog.getIllness());
            System.out.println("Владелец: " + dog.getOwnername());
            System.out.println("Дата рождения: " + dog.getBirthday());
            System.out.println("Жизненный цикл: ");
            dog.liveCircle();
            dog.toGo();
            dog.swim();
            dog.run();
            System.out.println(dog.getRunSpeed());
            System.out.println("Врач: " + zooPsiholog.getName() + " " + zooPsiholog.getSurName() + " "
                    + zooPsiholog.getSpetialisation());
            System.out.println("Медсестра : " + nurseTwo.getName() + " " + nurseTwo.getSurName());
            return;

        }

        if (input == 4) {
            System.out.println("Имя рыбки: " + fish.getName());
            System.out.println("Болезнь: " + fish.getIllness());
            System.out.println("Владелец: " + fish.getOwnername());
            System.out.println("Дата рождения: " + fish.getBirthday());
            System.out.println("Жизненный цикл: ");
            fish.liveCircle();
            fish.swim();
            fish.run();
            System.out.println(dog.getRunSpeed());
            System.out.println("Врач: " + terapevt.getName() + " " + terapevt.getSurName() + " "
                    + zooPsiholog.getSpetialisation());
            System.out.println("Медсестра : " + nurseOne.getName() + " " + nurseOne.getSurName());
            return;
        }

        if (input == 0) {
            return;
        }
    }
}