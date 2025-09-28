package identifier;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPersonInfo(String name, int age) {
        return "Name: " + name + "\nAge: " + age + "\n";
    }

    public String getPersonInfo() {
        return "Name: " + name + "\nAge: " + age + "\n";
    }
}
