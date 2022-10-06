public class Waiters extends MaitredHotel {


    public Waiters(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public String greetClients() {
        return super.greetClients();
    }

    public String takeOrder() {
        return "Waiter: I'm taking orders";
    }

    public String serveFood() {
        return "Waiter: I'm serving food";
    }

    public String cleanTable() {
        return "Waiter: I'm cleaning table";
    }

    public String takePayment() {
        return "Waiter: I'm taking payment";
    }


}
