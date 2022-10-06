public class Manager {
    private String name;
    private String surname;
    private int age;


    public Manager(String name, String surname, int age) {
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

    public Chef hireChef(String name, String surname, int age) {
        return new Chef(name, surname, age);
    }

    public void hireChefSay(){
        System.out.println("I hired a new chef");
        }

    public Accountant hireAccountant(String name, String surname, int age) {
        return new Accountant(name, surname, age);
    }

    public void hireAccountantSay(){
        System.out.println("I hired a new accountant");
        }

    public MaitredHotel hireMaitredHotel(String name, String surname, int age) {
        return new MaitredHotel(name, surname, age);
    }

    public void hireMaitredHotelSay(){
        System.out.println("I hired a new maitre d'Hotel");
        }

    }

