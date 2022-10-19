package classes.student;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private Address address;

    public Student(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
