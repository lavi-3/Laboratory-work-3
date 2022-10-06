public class MaitredHotel extends Manager {

    public MaitredHotel(String name, String surname, int age) {
        super(name, surname, age);

    }

    @Override
    public void hireChefSay() {
        super.hireChefSay();
        System.out.println("I hired a new maitre d'Hotel");
    }

    public String greetClients() {
        return "Maitre d'Hotel: I greet clients";
    }

    public String takeOrders() {
        return "Maitre d'Hotel: I take orders";
    }

    public String reservations() {
        return "Maitre d'Hotel: I make reservations";
    }

    public Waiters hireWaiters (String name, String surname, int age) {
        return new Waiters(name, surname, age);
    }

    public Barman hireBarman (String name, String surname, int age) {
        return new Barman(name, surname, age);
    }

    public Maid hireMaid (String name, String surname, int age) {
        return new Maid(name, surname, age);
    }



}
