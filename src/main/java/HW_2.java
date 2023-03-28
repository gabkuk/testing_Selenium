public class HW_2 {
    public static void main(String[] args) {
        int a = 12;
        long b = 0;
        //addition
        System.out.println(a + b);
        //subtraction
        System.out.println(a - b);
        //multiplication
        System.out.println(a * b);
        //division
        if (b == 0) {
            System.out.println("division by zero is prohibited!!!");
        } else
            System.out.println(a / b);

        //Также вывести остаток от деления и сделать проверку на четность этих переменных.
        System.out.println("remainder of the division of \"b\" by \"a\" :" + b % a);

        //Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом)

        System.out.println("\u263A");
    }

}
