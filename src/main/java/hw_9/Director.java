package hw_9;

public class Director extends Employee {
    private int numberOfSubordinates;

    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        double salary = super.getSalary();
        if (numberOfSubordinates > 0) {
            return salary * (numberOfSubordinates / (double) 100 * 9) + salary;
        } else return salary;
    }
}
