public class Dishwasher extends LineCooks {

    public Dishwasher(String name, String surname, int age) {
        super(name, surname, age);

    }


    @Override
    public String clean() {
        return super.clean();
    }

    public String washDishes() {
        return "I'm washing dishes";
    }
}
