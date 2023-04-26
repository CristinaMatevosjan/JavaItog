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
                infoAnimal(animals, input);
                showMenu(animals, input);
            case 4:
                animals.animalComands.trainNewTeam(input);
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
            animal.showListComands(choice);
            infoAnimal(animal, input);
        } else
            showMenu(animal, input);
    }
}
