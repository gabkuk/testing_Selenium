package hw_8_2;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.DoubleStream;

public class EmployeeUtils {
    //поиск сотрудника в массиве по его имени
    public static Employee getEmployeeByName(Employee[] employees, String name) throws RuntimeException {
        boolean isExist = true;

        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        throw new RuntimeException("Employee with name: " + name + " does not exist");
    }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Optional<Employee> getEmployeeBySubstringInName(Employee[] employees, String substring) {

        return Arrays.stream(employees).filter(employee -> (employee.getName().contains(substring))).findFirst();
    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static double countSalary(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getBaseSalary();
        }

        return sum;
    }

    //поиск наименьшей зарплаты в массиве

    public static double minSalary(Employee[] employees) {
        return Arrays.stream(employees).map(employee -> employee.getBaseSalary()).min((sal1, sal2) -> {
             return sal1.compareTo(sal2);
        }).get();
    }


    //поиск наибольшей зарплаты в массиве
    public static double maxSalary(Employee[] employees) {
        return Arrays.stream(employees).map(employee -> employee.getBaseSalary()).max((sal1, sal2) -> {
             return sal1.compareTo(sal2);
        }).get();
    }

    //поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public static double maxBonusOfManager(Manager[] managers){
      return   Arrays.stream(managers).map(manager -> {
            return manager.getSalaryManager() - manager.getBaseSalary();
        }).max(Double::compareTo).get();
    }


}
