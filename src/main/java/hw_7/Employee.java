package hw_7;

public class Employee {
    private String name;
    private byte age;
    private Gender gender;
    private Double salary;

    public Employee(String name, byte age, Gender gender, Double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public boolean isSameName(Employee employee){
        if (employee.getName().equals(this.name)){
            return true;
        }else
        return false;
    }

    public static void main(String[] args) {
        Employee alex = new Employee("alex", (byte) 35, Gender.Male, 1.5);
        Employee valera = new Employee("valera", (byte) 35, Gender.Male, 1.5);
        System.out.println(alex.isSameName(valera));
    }
}
