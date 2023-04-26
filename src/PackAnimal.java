public abstract class PackAnimal extends Animal  {


    protected PackAnimal(int id, int number, String name,String dateBirthday, AnimalComands comands ) {
        super(id,number,name,dateBirthday,comands );

    }


    @Override
    public String toString() {
        return String.format("Id: %d; Колличество: %d; Имя: %s; Дата рождения: %s; Команды: %s",
                this.getId(), this.getNumber(), this.getName(), this.getDob(),this.getAnimalComands());
    }

}

