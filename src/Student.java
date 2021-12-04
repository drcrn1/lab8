public class Student extends People{
    Student(String nameN, String lastnameN, int ageN){
        super(nameN,lastnameN,ageN);
    }

    @Override
    void walk(){
        System.out.println(name + " is not allowed to walk in class.");
    }
    void learn(){
        System.out.println(name + " learn");
    }
}
