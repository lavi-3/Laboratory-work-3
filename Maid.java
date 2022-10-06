public class Maid extends Waiters {
    private String name;
    private String surname;
    private int age;

    public Maid(String name, String surname, int age) {
        super(name, surname, age);

          }

        @Override
        public String cleanTable() {
            return super.greetClients();
        }


        public String cleanRoom() {
        return "I clean the dining room";
    }

    public String cleanToilets() {
        return "I clean the toilets";
    }
}
