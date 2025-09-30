package oop;

public class Student extends Person {
    private String name;
    private int age;
    public String studentId;

    public Student(String codeInputName, int codeInputAge) {
        super(codeInputName, codeInputAge);
        this.name = codeInputName;
        this.age = codeInputAge;
    }

    public Student(String codeInputName, int codeInputAge, String codeInputId) {
        super(codeInputName, codeInputAge);
        this.studentId = codeInputId;
        this.name = codeInputName;
        this.age = codeInputAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setAge(int codeInputNewAge) {
        this.age = codeInputNewAge;
    }

}
