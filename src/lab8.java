public class lab8 {
    static public void main(String[] args) {
        Student student = new Student("qwerty", "student", 19);
        student.walk();
        student.run();
        student.voice();
        student.learn();
        System.out.println(student.toString());
        Teacher teacher = new Teacher("qwertyu", "teacher", 43);
        teacher.walk();
        teacher.run();
        teacher.voice();
        teacher.teach();
        System.out.println(teacher.toString());
    }
}

