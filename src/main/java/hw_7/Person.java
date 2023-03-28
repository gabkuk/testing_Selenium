package hw_7;

public class Person {
    private String name;
    private byte age;
    private Gender gender;

    public Person(String name, byte age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        if (gender.equals(Gender.Male)){
            return "Mr: " + name;
        }else
        return "Mrs: " + name;
    }

    public static void main(String[] args) {
        Person alex = new Person("alex", (byte) 2, Gender.Male);
        System.out.println(alex.getName());
    }
}
