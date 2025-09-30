package oop;

public class Person {
    private String name;
    private int age;

    public Person(String codeInputName, int codeInputAge) {
        this.name = codeInputName;
        this.age = codeInputAge;
    }

    public String getInfo() {
        return name + " (" + age + " years old)";
    }

}
