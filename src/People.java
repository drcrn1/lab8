public class People {
    protected String name;
    protected String lastname;
    protected int age;

    People() {
        name = "none";
        lastname = "none";
        age = 100;
    }

    People(String nameN, String lastnameN, int ageN) {
        name = nameN;
        lastname = lastnameN;
        age = ageN;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }

    void walk() {
        System.out.println(name + " walk");
    }

    void run() {
        System.out.println(name + " run");
    }

    void voice() {
        System.out.println(name + " voice");
    }
}