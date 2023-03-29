package hw_8_2;

public class Worker extends Employee{
    public Worker(String name, double baseSalary) {
        super(name, baseSalary);
    }
    public double getSalaryWorker(){
        return super.getBaseSalary();
    }
}
