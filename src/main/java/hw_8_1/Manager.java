package hw_8_1;

public class Manager extends Employee{
    //Задача №2
    //Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
    // Все поля сделать приватными и для каждого поля добавить методы set и get.
    // Класс должен иметь метод - getSalary(int days), метод возвращает зарплату за количество дней
    //
    //
    // которые были переданы в качестве аргумента.
    //К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
    //класс Manager расширяет класс  Employee из задачи 1.
    private int workers;

    public Manager(String name, int age, String gender, double salaryPerDay, int workers) {
        super(name, age, gender, salaryPerDay);
        this.workers = workers;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    @Override
    public double gerSalary(int days) {
       return super.gerSalary(days) * 1.01;
    }
}
