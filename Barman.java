public class Barman extends MaitredHotel {
    private String name;
    private String surname;
    private int age;

    public Barman(String name, String surname, int age) {
    super(name, surname, age);
        this.name = name;
        this.surname = surname;
        this.age = age;
    }



    public String makeDrinks() {
        return "Barman: I make and serve drinks";
    }

    public String therapist() {
        return "Barman : I'm a therapist for sad drinkers";
    }
}
