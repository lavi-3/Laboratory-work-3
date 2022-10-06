public class DeliveryGuy extends Waiters {


    public DeliveryGuy(String name, String surname, int age) {
        super(name, surname, age);
    }

    public String deliverFood() {
        return "Delivery guy: I deliver food";
    }

    public String deliverDrinks() {
        return "Delivery guy: I deliver drinks";
    }

}
