public class Chef extends Manager{
    private String name;
    private String surname;
    private int age;

    public Chef(String name, String surname, int age) {
        super(name, surname, age);
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;    }
    public void setName(String name) {
        this.name = name;    }
    public String getSurname() {
        return surname;    }
    public void setSurname(String surname) {
        this.surname = surname;    }
    public int getAge() {
        return age;    }
    public void setAge(int age) {
        this.age = age;    }

    public SousChef hireSousChef() {
        return new SousChef(name, surname, age);
    }

    public void hireSousChefSay(){
        System.out.println("I hired a new sous chef");
        }

    public PastryChef hirePastryChef() {
        return new PastryChef(name, surname, age);
    }

    public void hirePastryChefSay(){
        System.out.println("I hired a new pastry chef");
        }

    public LineCooks hireLineCooks() {
        return new LineCooks(name, surname, age);
    }

    public void hireLineCooksSay(){
        System.out.println("I hired a new line cook");
        }

    public Dishwasher hireDishwasher() {
        return new Dishwasher(name, surname, age);
    }

    public void hireDishwasherSay(){
        System.out.println("I hired a new dishwasher");
    }

    public String composeMenu() {
        return "Chef: Menu ready and improved!";
    }

    public static boolean tastes() {
        if(Math.random() > 0.5) {
            System.out.println("Chef: Delicious!");
            return true;
        } else {
            System.out.println("Chef: Redo it!");
            return false;
        }
    }

}
