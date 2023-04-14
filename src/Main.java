import java.util.EnumSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo animals = new Zoo();
        Scanner input = new Scanner(System.in);
        showMenu(animals, input);
        input.close();


    }

    private static void showMenu(Zoo animals, Scanner input) {
        System.out.println("1. Добавить животное в зоопарк \n"+
        "2. Удалить животное из зоопарка\n"+
        "3. Просмотреть список команд животного\n"+
        "4. Добавить животному команду\n"+
        "5. Выйти\n"+
        "Выберите пункт меню: ");

        int choice = input.nextInt();
        switch (choice) {
            case 1:
                addAnimal(animals, input);
                showMenu(animals, input);
            case 2:
                removeAnimal(animals, input);
                showMenu(animals, input);
            case 3:
                showListComands(animals, input);
                showMenu(animals, input);
            case 4:
                trainNewTeam(,input);
                showMenu(animals, input);
            case 5:
               break;
        }

    }

    private static void addAnimal(Zoo animals, Scanner input) {
        System.out.println("1. Добавить кота");
        System.out.println("2. Добавить хомяка");
        System.out.println("3. Добавить собаку");
        System.out.println("4. Добавить верблюда");
        System.out.println("5. Добавить осла");
        System.out.println("6. Добавить лошадь");
        System.out.println("7. Назад");
        System.out.print("Выберите пункт меню: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                animals.addCat(input);
                showMenu(animals, input);
            case 2:
                animals.addHamster(input);
                showMenu(animals, input);
            case 3:
                animals.addDog(input);
                showMenu(animals, input);
            case 4:
                animals.addCamel(input);
                showMenu(animals, input);
            case 5:
                animals.addDonkey(input);
                showMenu(animals, input);
            case 6:
                animals.addHorse(input);
                showMenu(animals, input);
            case 7:
                showMenu(animals, input);
        }

    }

//    private static void trainNewTeam(Zoo animals,Scanner input) {
//        System.out.println("1. Обучить команде STOP \n" +
//        "2. Обучить команде VOICE \n " +
//       "3. Обучить команде TO_ME \n" +
//        "4. Обучить команде FORWARD \n"+
//        "5. Обучить команде BUT_BUT\n" +
//                "6. Обучить команде GO_AHEAD\n" +
//                "7. Обучить команде YOU_STUPID_BRUTE\n" +
//                "8. Обучить команде JUMP\n" +
//                "9. Обучить команде SIT\n" +
//                "10. Обучить команде GIVE_ME_A_PAW\n" +
//                "11. Обучить команде SPIT \n" +
//                "12. Назад \n" +
//                "Выберите пункт меню: ");
//
//
//        int choice = input.nextInt();
//        EnumSet <Comands> set=EnumSet.noneOf(Comands.class);
//        switch (choice) {
//            case 1:
//                set.add(Comands.STOP);
//                showMenu(animals, input);
//            case 2:
//                set.add(Comands.VOICE);
//                showMenu(animals, input);
//            case 3:
//                set.add(Comands.TO_ME);
//                showMenu(animals, input);
//            case 4:
//                set.add(Comands.FORWARD);
//                showMenu(animals, input);
//            case 5:
//                set.add(Comands.BUT_BUT);
//                showMenu(animals, input);
//            case 6:
//                set.add(Comands.GO_AHEAD);
//                showMenu(animals, input);
//            case 7:
//                set.add(Comands.YOU_STUPID_BRUTE);
//                showMenu(animals, input);
//            case 8:
//                set.add(Comands.JUMP);
//                showMenu(animals, input);
//            case 9:
//                set.add(Comands.SIT);
//                showMenu(animals, input);
//            case 10:
//                set.add(Comands.GIVE_ME_A_PAW);
//                showMenu(animals, input);
//            case 11:
//                set.add(Comands.SPIT);
//                showMenu(animals, input);
//            case 12:
//                showMenu(animals, input);
//        }
//
//    }


    private static void removeAnimal(Zoo animal, Scanner input) {
        animal.showAll();
        System.out.printf("%d) Назад\n", Zoo.allAnimal.size());
        System.out.print("Введите цифру кого хотите удалить: ");
        int choice = input.nextInt();
        if (choice < Zoo.allAnimal.size()) {
            animal.removeAnimal(choice);
            System.out.println("Вы успешно удалили животное!");
            showMenu(animal, input);
        } else
            showMenu(animal, input);

    }

    private static void infoAnimal(Zoo animal, Scanner input) {
        animal.showAll();
        System.out.printf("%d) Назад\n", Zoo.allAnimal.size());
        System.out.print("Введите цифру кого хотите посмотреть: ");
        int choice = input.nextInt();
        if (choice < Zoo.allAnimal.size()) {
            animal.showAnimal(choice);
            infoAnimal(animal, input);
        } else
            showMenu(animal, input);
    }



}
