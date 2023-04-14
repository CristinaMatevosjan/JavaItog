import java.util.EnumSet;

public abstract class Animal {
    private int id;
    private int number;
    private String name;

    private String dob;

    private AnimalComands comands.;


    protected Animal(int id, int number, String name, String dob, AnimalComands comands) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.dob=dob;
        this.comands=comands;

    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public AnimalComands getComands() {
        return comands;
    }

    @Override
    public String toString() {
        return String.format("Id: %d; Колличество: %d; Имя: %s; Дата рождения: %s; Команды: %s",
                this.id, this.number, this.name, this.dob,this.comands);
    }


}