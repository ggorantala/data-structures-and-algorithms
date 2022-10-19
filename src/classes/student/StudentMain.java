package classes.student;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(100L, "Gopi", "Gorantala");
        Student s2 = s1; // Shallow copy
    }
}
