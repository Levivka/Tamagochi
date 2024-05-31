import animals.Cat;
import animals.Dog;
import animals.Pet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int difficulty = 0;
        Scanner sc = new Scanner(System.in);
        Pet pet = null;

        System.out.println("Choose your destiny!\n1.Кощка\uD83D\uDC31\n2.Сибек\uD83D\uDC36");
        switch (sc.nextInt()) {
            case 1:
                pet = new Cat();
                break;
            case 2:
                pet = new Dog();
                break;
            default:
                return;
        }

        System.out.println("Как будут звать вашего питомца?");
        pet.setName(sc.next());

        System.out.println("Выберите уровень сложности:\n1.Лёгкий\n2.Средний\n3.Тяжёлый");
        difficulty = sc.nextInt();

        if (difficulty > 0 && difficulty < 4) {
            pet.setHealth(100 / difficulty);
            pet.setHungriness(100 / difficulty);
        }
        else {
            return;
        }

        pet.greetings();

        while (true) {
            System.out.println("Что будете делать с питомцом?\n1.Кормить\uD83C\uDF57\n2.Гулять\uD83C\uDFC3\uD83C\uDFFB\u200D♂\uFE0F\n3.Гладить\uD83D\uDC4B\n4.Осмотреть");

            if (pet.getHealth() < 25) {
                System.out.println("Вашему питомцу нездаровится");
            }
            if (pet.getHungriness() < 25) {
                System.out.println("Ваш питомец голодает\uD83C\uDF7D");
            }

            switch (sc.nextInt()) {
                case 1:
                    pet.feeding();
                    break;
                case 2:
                    pet.walk();
                    if (pet.getHungriness() <= 0) {
                        System.out.println("Питомец переутомился \uD83D\uDC80");
                        return;
                    }
                    break;
                case 3:
                    pet.satisfaction();
                    break;
                case 4:
                    System.out.printf("Здоровье питомца - %d\nСытость питомца - %d\n", pet.getHealth(), pet.getHungriness());
            }
        }
    }
}