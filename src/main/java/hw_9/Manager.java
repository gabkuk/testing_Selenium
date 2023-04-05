package hw_9;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {

        return numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        double salary = super.getSalary();
        if (numberOfSubordinates > 0) {
            return salary * (numberOfSubordinates / (double) 100 * 3) + salary;
        } else return salary;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() +
                " numberOfSubordinates=" + numberOfSubordinates +
                '}';
    }
}
