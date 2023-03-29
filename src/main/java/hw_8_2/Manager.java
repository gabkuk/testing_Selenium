package hw_8_2;

public class Manager extends Employee{
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
   public double getSalaryManager(){
       if (numberOfSubordinates > 0){
           return super.getBaseSalary() * (numberOfSubordinates / 100 * 3);
       } else return super.getBaseSalary();
    }

}
