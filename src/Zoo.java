import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Scanner;

public class Zoo {

    AnimalComands animalComands=new AnimalComands();
    Scanner sc=new Scanner(System.in);
       public static ArrayList<Animal> allAnimal = new ArrayList<>();
    {
        //allAnimal.add(new Cat(1, "Вася", 1, "12.03.2020",));

    }

    public int size(){
        return allAnimal.size();
    }

    public void addCat(Scanner input){
        int id;
        int number;
        String name;
        String dob;
        EnumSet<Comands> set;

        System.out.print("Id: ");
        id = input.nextInt();
        System.out.print("Колличество: ");
        number = input.nextInt();
        System.out.print("Имя?: ");
        name = input.next();
        System.out.print("Дата рождения: ");
        dob = input.next();
        System.out.print("Команды?: ");
        set = animalComands.trainNewTeam(animalComands.getComands(),sc );

        Zoo.allAnimal.add(new Cat(id, number, name, dob, set ));
    }

    public void addDog(Scanner input){
        int id;
        int number;
        String name;
        String dob;
        EnumSet<Comands> set;

        System.out.print("Id: ");
        id = input.nextInt();
        System.out.print("Колличество: ");
        number = input.nextInt();
        System.out.print("Имя?: ");
        name = input.next();
        System.out.print("Дата рождения: ");
        dob = input.next();
        System.out.print("Команды?: ");
        set = trainNewTeam   //input.nextInt();


        Zoo.allAnimal.add(new Dog(id, number, name, dob,  ));
    }

    public void addHamster(Scanner input){
        int id;
        int number;
        String name;
        String dob;
        EnumSet<Comands> set;

        System.out.print("Id: ");
        id = input.nextInt();
        System.out.print("Колличество: ");
        number = input.nextInt();
        System.out.print("Имя?: ");
        name = input.next();
        System.out.print("Дата рождения: ");
        dob = input.next();
        System.out.print("Команды?: ");
        set = trainNewTeam   //input.nextInt();


        Zoo.allAnimal.add(new Hamster(id, number, name, dob,  ));

        }

    public void addHorse(Scanner input){
        int id;
        int number;
        String name;
        String dob;
        EnumSet<Comands> set;

        System.out.print("Id: ");
        id = input.nextInt();
        System.out.print("Колличество: ");
        number = input.nextInt();
        System.out.print("Имя?: ");
        name = input.next();
        System.out.print("Дата рождения: ");
        dob = input.next();
        System.out.print("Команды?: ");
        set = trainNewTeam   //input.nextInt();

        Zoo.allAnimal.add(new Horse(id, number, name, dob,  ));

    }

    public void addDonkey(Scanner input){
        int id;
        int number;
        String name;
        String dob;
        EnumSet<Comands> set;

        System.out.print("Id: ");
        id = input.nextInt();
        System.out.print("Колличество: ");
        number = input.nextInt();
        System.out.print("Имя?: ");
        name = input.next();
        System.out.print("Дата рождения: ");
        dob = input.next();
        System.out.print("Команды?: ");
        set = trainNewTeam   //input.nextInt();

        Zoo.allAnimal.add(new Donkey(id, number, name, dob,  ));

        }

    public void addCamel(Scanner input){
        int id;
        int number;
        String name;
        String dob;
        EnumSet<Comands> set;

        System.out.print("Id: ");
        id = input.nextInt();
        System.out.print("Колличество: ");
        number = input.nextInt();
        System.out.print("Имя?: ");
        name = input.next();
        System.out.print("Дата рождения: ");
        dob = input.next();
        System.out.print("Команды?: ");
        set = trainNewTeam   //input.nextInt();

        Zoo.allAnimal.add(new Camel(id, number, name, dob,  ));

        }

    void showAll(){
        int index = 0;
        for (Animal animal : allAnimal) {
            System.out.printf("%d) ", index);
            System.out.println(animal);
            System.out.println("----");
            index++;
        }
    }

    void removeAnimal(int num){
        allAnimal.remove(num);
    }

    void showListComands(int num){
        System.out.println(allAnimal.get(num));
        if (allAnimal.get(num) instanceof Pets){
            ((Pets)allAnimal.get(num)).;
        }
        if (allAnimal.get(num) instanceof PackAnimal){
            ((PackAnimal)allAnimal.get(num)).;
        }
    }

}