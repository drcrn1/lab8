public class Teacher extends People{
    Teacher(String nameN, String lastnameN, int ageN){
        super(nameN,lastnameN,ageN);
    }

    @Override
    void voice(){
        System.out.println(name + " voice");
    }
    void teach(){
        System.out.println(name + " teach");
    }
}
