import java.util.EnumSet;
import java.util.Scanner;

public class AnimalComands {
    private EnumSet<Comands> comands=EnumSet.noneOf(Comands.class);

    public EnumSet<Comands> getComands() {
        return comands;
    }

    public EnumSet<Comands> trainNewTeam(EnumSet<Comands> comands, Scanner input) {
        System.out.println("1. Обучить команде STOP \n" +
                "2. Обучить команде VOICE \n " +
                "3. Обучить команде TO_ME \n" +
                "4. Обучить команде FORWARD \n"+
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
        switch (choice) {
            case 1:
                comands.add(Comands.STOP);
                break;
            case 2:
                comands.add(Comands.VOICE);
                break;
            case 3:
                comands.add(Comands.TO_ME);
                break;
            case 4:
                comands.add(Comands.FORWARD);
                break;
            case 5:
                comands.add(Comands.BUT_BUT);
                break;
            case 6:
                comands.add(Comands.GO_AHEAD);
                break;
            case 7:
                comands.add(Comands.YOU_STUPID_BRUTE);
                break;
            case 8:
                comands.add(Comands.JUMP);
                break;
            case 9:
                comands.add(Comands.SIT);
                break;
            case 10:
                comands.add(Comands.GIVE_ME_A_PAW);
                break;
            case 11:
                comands.add(Comands.SPIT);
                break;

            case 12:
                break;
        }
        return comands;
    }
}
