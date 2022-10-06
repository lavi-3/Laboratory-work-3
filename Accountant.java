public class Accountant extends Manager {

    public Accountant(String name, String surname, int age) {
        super(name, surname, age);
    }

    public String calculateSalary() {
        return "Accountant: I'm calculating salary";
    }

    public String calculateTaxes() {
        return "Accountant: I'm calculating taxes";
    }

    public String calculateExpenses() {
        return "Accountant: I'm calculating profits and expenses";
    }
}
