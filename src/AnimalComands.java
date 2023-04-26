import java.util.EnumSet;
import java.util.Scanner;

public class AnimalComands {
    private EnumSet<Comands> comands;

    public EnumSet<Comands> getComands() {
        return comands;
    }

    public void init(EnumSet<Comands> comands) {
        this.comands = comands;
    }

    public AnimalComands newAnimalComands() {
        AnimalComands ac = new AnimalComands();
        EnumSet<Comands> comands1 = EnumSet.noneOf(Comands.class);
        ac.init(comands1);
        return ac;
    }

    public AnimalComands trainNewTeam(Scanner input) {
        System.out.println("1. Обучить команде STOP \n" +
                "2. Обучить команде VOICE \n " +
                "3. Обучить команде TO_ME \n" +
                "4. Обучить команде FORWARD \n" +
                "5. Обучить команде BUT_BUT\n" +
                "6. Обучить команде GO_AHEAD\n" +
                "7. Обучить команде YOU_STUPID_BRUTE\n" +
                "8. Обучить команде JUMP\n" +
                "9. Обучить команде SIT\n" +
                "10. Обучить команде GIVE_ME_A_PAW\n" +
                "11. Обучить команде SPIT \n" +
                "12. Назад \n" +
                "Выберите пункт меню: ");

        int choice = input.nextInt();
        AnimalComands animalComands = new AnimalComands();
        animalComands.newAnimalComands();
        switch (choice) {
            case 1:
                animalComands.getComands().add(Comands.STOP);
                break;
            case 2:
                animalComands.getComands().add(Comands.VOICE);
                break;
            case 3:
                animalComands.getComands().add(Comands.TO_ME);
                break;
            case 4:
                animalComands.getComands().add(Comands.FORWARD);
                break;
            case 5:
                animalComands.getComands().add(Comands.BUT_BUT);
                break;
            case 6:
                animalComands.getComands().add(Comands.GO_AHEAD);
                break;
            case 7:
                animalComands.getComands().add(Comands.YOU_STUPID_BRUTE);
                break;
            case 8:
                animalComands.getComands().add(Comands.JUMP);
                break;
            case 9:
                animalComands.getComands().add(Comands.SIT);
                break;
            case 10:
                animalComands.getComands().add(Comands.GIVE_ME_A_PAW);
                break;
            case 11:
                animalComands.getComands().add(Comands.SPIT);
                break;

            case 12:
                break;
        }
        return animalComands;
    }

    @Override
    public String toString() {
        return String.format("Команды: %s", this.comands);
    }
}