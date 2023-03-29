package hw_8_2;

public class Director extends Employee{

    private int numberOfSubordinates;

    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }


    public double getSalaryDirector(){
        if (numberOfSubordinates > 0){
            return super.getBaseSalary() * (numberOfSubordinates / 100 * 9);
        } else return super.getBaseSalary();
    }
}
